package Task3_FlatMapRelated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {
        State va = new State();
        va.addCity("McLean");
        va.addCity("Arlington");
        va.addCity("Fairfax");
        va.addCity("Fallschurch");

        State tx = new State();
        tx.addCity("Dallas");
        tx.addCity("Plano");
        tx.addCity("Austin");
        tx.addCity("House");

        List<State> list = Arrays.asList(va, tx);

        list.stream().map(state -> state.getCity()).forEach(System.out::println); //->Stream of stream

        System.out.println("-----------------------------------");
        list.stream()
                .map(state -> state.getCity())
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
