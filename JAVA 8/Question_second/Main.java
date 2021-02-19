package Question_second;
//Create a functional interface whose method
// takes 2 integers and return one integer.
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction = (x,y)-> x + 1 + y;
        System.out.println(biFunction.apply(4,7));

    }
}
