// Write a program to find the number of occurrences of a character
// in a string without using loop?
import java.util.HashMap;
import java.util.Map;

public class Third {

        public static void main(String[] args)
        {
            String str = "Java why java how java now java";
            int count = str.length() - str.replace("a", "").length();
            System.out.println("Number of occurances of 'a' in"+str+"  = "+count);
        }
    }
