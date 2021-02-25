package Question_twelfth;
//Find the first even number in the integer list which is greater than 3

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(2,1,3,5,6,3,5);
       System.out.println(numbers.stream()
                .filter(x->x>3)
                .findFirst());
    }
}
