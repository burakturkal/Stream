package Task2_MapRelated;

import java.util.Arrays;
import java.util.List;

import static Task2_MapRelated.Type.*;
import static java.util.Comparator.comparing;

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



        System.out.println("------Second Part--------: Length");
        menu.stream()
                .map(dish -> dish.getName().length());

        System.out.println("------Third Part--------: Name + Length");
        menu.stream()
                .map(dish -> dish.getName().length());

        menu.forEach(dish -> System.out.println(dish.getName() + " " +dish.getName().length()));



        System.out.println("---------------------------");
        //Print 3 High Calorie Dish Name (High Calorie Dishes are over 300 calories)
        menu.stream()
                .filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);



        System.out.println("---------------------------");
        //Print all dish name that are below 400 calories in sorted
        menu.stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);





    }
}
