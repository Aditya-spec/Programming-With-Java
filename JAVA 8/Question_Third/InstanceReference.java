package Question_Third;
//Using (instance) Method reference create
// and apply add and subtract method and using (Static)
// Method reference create and apply
// multiplication method for the functional interface created.
import java.util.function.BiFunction;

public class InstanceReference {

    private Integer Addition(Integer integer, Integer integer1) {
    return integer+integer1;
    }

    private Integer Subtraction(Integer integer, Integer integer1) {
    return integer-integer1;
    }
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> add=new InstanceReference()::Addition;
        System.out.println("Addition is:"+add.apply(12,11));
        BiFunction<Integer,Integer,Integer> diff=new InstanceReference()::Subtraction;
        System.out.println("Subtraction is:"+diff.apply(12,11));

    }


}
