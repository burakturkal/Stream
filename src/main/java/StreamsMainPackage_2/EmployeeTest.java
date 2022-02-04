package StreamsMainPackage_2;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        /*
        We don't write .stream() here because when we already built the stream
        in readAll method under EmployeeData class
         */


        //Print all emails - One employee has one email - One-To-One Mapping
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);


        System.out.println("---------------------------------");
        //Print all numbers -
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                //above you see IntelliJ says Stream<List<string>> :: meaning Stream inside Stream
                .forEach(System.out::println);

        System.out.println("---------------------------------");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        //above and below are the same

        System.out.println("---------------------------------");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
