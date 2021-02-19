//Find average of the number inside integer list after doubling it.
package Question_Eleventh;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,4,5,6,7,3,5,7);
        int length=numbers.size();
        System.out.println(length);
       float number = numbers.stream()
                .map(x->2*x)
                .reduce(0 , Integer::sum)/length;
       System.out.println(number);

    }
}
