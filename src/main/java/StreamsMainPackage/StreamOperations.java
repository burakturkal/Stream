package StreamsMainPackage;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,2,1,3,3,2,4);
        // filter.forEach(x -> System.out.println(x)); --> Simplified below
        myList.forEach(System.out::println);


        //Convert myList into streams
        System.out.println("-------Below is Filter And Distinct Intermadiate---------");
        /*
        FILTER
        Filtering with a predicate : The stream interface supports a filter method.
        This operation takes as argument a predicate (a function returning a boolean) and
        returns a stream including all elements that matches the predicate. */

        /*
        DISTINCT
        Filtering unique elements : The stream interface supports a distinct method. This
        operation returns a stream with unique elements.
         */

        myList.stream()
                ./*right side gives implementation to stream interface*/filter(i -> i%3==0)
                .distinct() //not to show the same values
                ./*right side to print all*/forEach(System.out::println);







        System.out.println("--------------Below is Limit Intermadiate-------------");
        /*
        LIMIT
        The stream interface supports a limit(n) method. This operation returns
        a stream that’s no longer than a given size.
         */

        System.out.println("LIMIT");
        myList.stream()
                .filter(i -> i%2==0)
                .limit(1)
                .forEach(System.out::println);





        System.out.println("--------------Below is Skip Intermadiate-------------");

        /*
        SKIP
        The stream interface supports a skip(n) method. This operation returns
        a stream that discards the first n element.
        If the stream has fewer than n elements, an empty stream is returned.
         */

        myList.stream()
                .filter(i -> i%2==0)
                .skip(0)
                .forEach(System.out::println);





        System.out.println("--------------Below is Skip Intermadiate-------------");

        /*
        MAP
         The stream interface supports a map method. This operation takes a
         function as argument. The function is applied to each element,
         mapping it to a new element.
         */

        myList.stream()
                .map(number -> number*2)
                .filter(i -> i%3 ==0)
                .filter(i -> i%5 ==1)
                .forEach(System.out::println);


    }
}
