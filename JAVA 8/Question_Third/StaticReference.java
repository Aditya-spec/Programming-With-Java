package Question_Third;
//Using (instance) Method reference create
// and apply add and subtract method and using (Static)
// Method reference create and apply
// multiplication method for the functional interface created.
import java.util.function.BiFunction;

public class StaticReference {
    private static Integer multiplication(Integer integer, Integer integer1) {
    return integer*integer1;
    }

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> multiply=StaticReference::multiplication;
        System.out.println(multiply.apply(2,5));
    }


}
