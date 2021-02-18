//Write a method that takes a
//string and print the number of occurrence of
// each  characters in the string.
package Question_Third;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Third {
    public static void main(String[] args) {
        String str="welcome to intellij idea";
        char[] arr=str.toCharArray();
        System.out.println(arr);
        System.out.println();
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
          //  char key=str.charAt(i);
            if(map.containsKey(str.charAt(i))==true)
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            else
                map.put(str.charAt(i),1);
            }
        /*for(Map.Entry<Character, Integer> itr :map.entrySet())
            System.out.println(itr.getKey()+ ":" + itr.getValue());
        */
        System.out.println(map);
    }


    }

