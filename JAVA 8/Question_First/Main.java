//Write the following a functional interface and implement it using lambda:
//        (1) First number is greater than second number or not   -    Parameter (int ,int ) Return boolean
//        (2) Increment the number by 1 and return incremented value - Parameter (int) Return int
//        (3) Concatination of 2 string               -                 Parameter (String , String ) Return (String)
//        (4) Convert a string to uppercase and return .        -        Parameter (String) Return (String)


package Question_First;


/*
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.UnaryOperator;
*/

interface First{
boolean check(int a, int b);
}
interface Second{
    int check(int a);
}
interface Third{
    String check(String a, String b);
}
interface Fourth{
    String check(String a);
}
public class Main {
    public static void main(String[] args) {
/*
        BiPredicate<Integer,Integer> biPredicate=(x, y)->x>y; //return type will always be boolean of predicate
        System.out.print("(1:)");
        System.out.println(biPredicate.test(4,9));

        UnaryOperator<Integer> unaryOperator=x->x+1;
        System.out.print("(2:)");
        System.out.println(unaryOperator.apply(5));

       // Function<Integer,Integer> function=x->x+1;

        BiFunction<String,String,String> biFunction=(s1,s2)->s1+s2;
        System.out.print("(3:)");
        System.out.println(biFunction.apply("Hello","Java"));

        UnaryOperator<String> unaryOperator1=x->x.toUpperCase();//function can also be used
        System.out.print("(4:)");
        System.out.println(unaryOperator1.apply("hello java"));
*/

 First first=(x,y)->x>y;
 System.out.println(first.check(4,5));

 Second second=x->x+1;
 System.out.println(second.check(5));

 Third third=(x,y)->x+y;
 System.out.println(third.check("Hello","World"));

Fourth fourth=x->x.toUpperCase();
System.out.println(fourth.check("hello java"));
    }
}
