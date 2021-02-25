import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//WAP to sorting string without using string Methods?.
public class Second {
    public static void main(String[] args) {

        String str="Hello to java Programming";
        String[] arr= str.split(" ");
        List<String> list=new ArrayList<String>();
        for(String val:arr){
        list.add(val);
        }
       
        List<String> newList=list.stream().sorted( String::compareTo).collect(Collectors.toList());
        System.out.println(newList);

    }
}
