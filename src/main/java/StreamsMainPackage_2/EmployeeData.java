package StreamsMainPackage_2;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
        new Employee(100,"Mike","mike@cydeo.com", Arrays.asList("29923012394", "2315374532")),
        new Employee(101,"Ozzy","ozzy@cydeo.com", Arrays.asList("34574734342", "3453376546")),
        new Employee(102,"Peter","peter@cydeo.com", Arrays.asList("7546435483", "6545765878"))
        );
    }
}
