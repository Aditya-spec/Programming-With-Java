// Write a program to find the number of occurrences of a word
// in a string without using loop?
import java.util.HashMap;
import java.util.Map;
// Write a program to find the number of occurrences of a word in a string without using loop?
public class Third {
    public static void main(String[] args) {
        String s="big black bug bit a big black dog on his big black nose";
        char[] characters = s.toCharArray();
        HashMap<Character, Integer> m=new HashMap<Character, Integer>();
        for (int i=0;i< characters.length;i++){

            if(m.containsKey(characters[i])==true)
            {
                m.put(characters[i],m.get(characters[i]) + 1);
            }
            else
                m.put(characters[i],1 );
        }
        for (Map.Entry<Character,Integer> e: m.entrySet())
        {
            if(e.getValue() > 1)
                System.out.println(e.getKey()+ " " +e.getValue());
        }
    }
}
