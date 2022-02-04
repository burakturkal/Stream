package Task1_MapRelated;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        words.stream()
                // .map(i -> i.length()) --> Simplied below
                .map(String::length)
                .forEach(System.out::println);

        /*
        With distinct


        words.stream()
                // .map(i -> i.length()) --> Simplied below
                .map(String::length)
                .distinct()
                .forEach(System.out::println);


         */

        words.stream()
                // .map(i -> i.length()) --> Simplied below
                .map(String::length)
                .forEach(System.out::println);
    }
}
