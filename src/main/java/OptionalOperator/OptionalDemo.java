package OptionalOperator;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
        public static void main(String[] args) {

            List<Integer> numbers = Arrays.asList(2,4,2,10,23);

            //empty() - isPresent() -> important
            Optional<String> empty = Optional.empty();
            System.out.println(empty.isPresent()); //false
            System.out.println(Optional.of(numbers).isPresent()); //true

            //ifPresent -> important
            Optional<Integer> bigNumber = numbers.stream().filter(x -> x>100).findAny();
            bigNumber.ifPresent(System.out::println); //doesn't print anything bc it's not in numbers

            //get
            //System.out.println(bigNumber.get());

            //orElse -> important
            System.out.println(bigNumber.orElse(0));


        }

}
