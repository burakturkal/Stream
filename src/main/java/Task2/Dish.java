package Task2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dish {

    private String what;
    private boolean b;
    private int calories;
    private Type meat;
}
