package Task2_MapRelated;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dish {

    private String name;
    private boolean isVegetarian;
    private int calories;
    private Type meat;
}
