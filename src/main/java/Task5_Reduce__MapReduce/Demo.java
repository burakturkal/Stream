package Task5_Reduce__MapReduce;

import StreamsMainPackage_2.DishData_MatchingAndFinding;

public class Demo {

    public static void main(String[] args) {
        int dishCount = DishData_MatchingAndFinding.getAll().stream().map(d -> 1).reduce(0,(a,b) -> a+b);
        System.out.println(dishCount);

        long dcount = DishData_MatchingAndFinding.getAll().stream().count();
        System.out.println(dcount);
    }

}
