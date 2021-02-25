package Question_Fifth;
//Implement following functional interfaces from java.util.function using lambdas:
//
//(1) Consumer
//
//(2) Supplier
//
//(3) Predicate
//
//(4) Function
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate=x->x%2==0;
        System.out.println(predicate.test(8));

        Supplier<String> supplier=()->"Hello Java";
        System.out.println(supplier.get());

        Function<Integer,Integer> function=(x)-> x * 3 + 3;
        System.out.println(function.apply(6));

        Consumer<Integer> consumer=x-> System.out.println(x);
        consumer.accept(5);

    }
}
