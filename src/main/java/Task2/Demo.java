package Task2;

import java.util.Arrays;
import java.util.List;

import static Task2.Type.*;

public class Demo {
    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(

                new Dish("pork",false,800, MEAT),
                new Dish("beef",false,700, MEAT),
                new Dish("chicken",false,400, MEAT),
                new Dish("fries",true,530, OTHER),
                new Dish("rice",true,350, OTHER),
                new Dish("fruit",true,120, OTHER),
                new Dish("pizza",true,550, OTHER),
                new Dish("prawns",false,300, FISH),
                new Dish("salmon",false,450, FISH)
        );

        menu.stream()
                .filter(i -> i.getCalories() < 400)
                .forEach(System.out::println);

    }
}
