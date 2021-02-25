//Write a method that takes a string and returns the
// number of unique characters in the string

package Question_Second;

import java.util.HashSet;

public class Second {
    public static void main(String[] args) {
        String str="welcome to intellij idea";
        char[] arr=str.toCharArray();
        System.out.println(arr);
        HashSet<Character> set=new HashSet<Character>();
        for(int i =0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println();
        System.out.println(set);
    }
}
