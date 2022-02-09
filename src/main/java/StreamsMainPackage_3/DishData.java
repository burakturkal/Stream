package StreamsMainPackage_3;

import Task2_MapRelated.Dish;
import Task2_MapRelated.Type;

import java.util.Arrays;
import java.util.List;

import static Task2_MapRelated.Type.*;
import static Task2_MapRelated.Type.FISH;

public class DishData {
    public static List<Dish> getAll(){
        return Arrays.asList(
                new Dish("pork",false,800, Type.MEAT),
                new Dish("beef",false,700,Type.MEAT),
                new Dish("chicken",false,400,Type.MEAT),
                new Dish("french fries",true,530,Type.OTHER),
                new Dish("rice",true,350,Type.OTHER),
                new Dish("season fruit",true,120,Type.OTHER),
                new Dish("shrimp",false,300,Type.FISH),
                new Dish("salmon",false,450,Type.FISH)
        );
    }
}
