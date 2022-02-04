package StreamsMainPackage_2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        int result = numbers.stream()
                .filter(i -> i>4)
                .reduce(0,(a,b) -> a+b); //there are two reduce methods (Overloading)
                                                //it shows up in the menu when you start typing

        System.out.println(result);


        System.out.println("-------------------------------------");
        //No initial value
        Optional<Integer> result2 = numbers.stream()
                .reduce((a,b) -> a+b);

        //Finding Max and Min with REDUCE
        Optional<Integer> result_min =  numbers.stream().reduce(Integer::min);
        Optional<Integer> result_max =  numbers.stream().reduce(Integer::max);
        Optional<Integer> result_sum =  numbers.stream().reduce(Integer::sum);

        System.out.println("Min: " + result_min.get());
        System.out.println("Max: " + result_max.get());
        System.out.println("Sum: " + result_sum.get());
    }
}
