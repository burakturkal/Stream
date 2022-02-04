package StreamsMainPackage_2;

import Task2_MapRelated.Dish;

import java.util.Optional;

public class MatchingAndFinding {
    public static void main(String[] args) {

        //ALL MATCH
        boolean isHealthy = DishData_MatchingAndFinding.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);


        System.out.println("--------------------------");
        //ANY MATCH
        if(DishData_MatchingAndFinding.getAll().stream().anyMatch(Dish::isVegetarian))
            System.out.println("This menu is vegie friendly");


        System.out.println("--------------------------");
        //NONE MATCH
        boolean isHealthy2 = DishData_MatchingAndFinding.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);


        System.out.println("--------------------------");
        //FIND ANY
        Optional<Dish> dish = DishData_MatchingAndFinding.getAll().stream()
                                .filter(Dish::isVegetarian)
                                .findAny(); //return of findAny is "Optional"
        System.out.println(dish); //shows "Optional" type
        System.out.println(dish.get()); //doesn't show "Optional: text. Instead returns whatever is inside


        System.out.println("--------------------------");
        //FIND FIRST
        Optional<Dish> dish2 = DishData_MatchingAndFinding.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny(); //return of findAny is "Optional"
        System.out.println(dish2); //shows "Optional" type
        System.out.println(dish2.get()); //doesn't show "Optional: text. Instead returns whatever is inside

    }
}
