//Write a program to reverse a string and remove
// character from index 4 to index 9 from
// the reversed string using String Buffer
//Write a program to reverse a
// string and remove character from index 4 to index 9
// from the reversed string using String Buffer
import java.lang.*;
import java.io.*;
import java.util.*;

// Class of ReverseString
class Eight extends java.lang.IndexOutOfBoundsException{
    public static void main(String[] args)
    {
        String input = "abcdefghijklmnopqrstuvwxyz";
        char[] arr = input.toCharArray();
        int start, end = 0;
        end = arr.length - 1;

        for (start = 0; start < end; start++, end--) {

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

            System.out.println();
            StringBuffer stringb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            stringb.append(arr[i] + " ");
        }
            stringb = stringb.replace(8,17, "");

            String s = stringb.toString();
            System.out.println(s);

    }
}