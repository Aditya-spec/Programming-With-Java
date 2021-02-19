//Find average of the number inside integer list after doubling it.
package Question_Eleventh;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,4,5,6,7,3,5,7);
        int length=numbers.size();
        System.out.println(length);
       double number = numbers.stream()
                      .mapToDouble(x->x*2)
                       .average()
               .orElse(0.0);
       System.out.println(number);

    }
}
