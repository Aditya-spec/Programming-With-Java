
package Question_Tenth;
//Sum all the numbers greater than 5 in the integer list.
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(3,2,6,5,4,8,7,6,9,3);
        int number=numbers.stream().filter(x->x>5).reduce(0,(x,y)->x+y);
     System.out.println(number);
    }
}
