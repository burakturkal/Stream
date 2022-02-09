package Task6_Iterate_Infinite;

import java.sql.SQLOutput;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        //TASK 1
        Stream.iterate(new int[]{0,1}, t -> new int[]{t[1],t[0]+t[1]})
                .limit(8)
                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] + ")"));

        System.out.println("------------------");
        //TASK 2

        //In the case of tuble (3,5), the successor will be (5,3+5)
        Stream.iterate(new int[]{0,1}, t -> new int[]{t[1],t[0]+t[1]})
                .limit(8)
                .map(t -> t[0])
                .forEach(System.out::println);
    }
}
