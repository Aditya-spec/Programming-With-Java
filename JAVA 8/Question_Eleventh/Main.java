//Find average of the number inside integer list after doubling it.
package Question_Eleventh;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers= List.of(2,5,3,7,8,4,6);
       int number = numbers.stream()
                .map(x->2*x)
                .reduce(0 , Integer::sum);
       System.out.println(number);

    }
}
