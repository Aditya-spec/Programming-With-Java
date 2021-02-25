// WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. For the required loop, use a
//a)while statement
//b)do-while statement
package Ques_Eight;

import java.util.Scanner;

public class Using_doWhile {
    public void comp(String s){
        int end=s.length()-1;
        char first=s.charAt(0);
        char last=s.charAt(end);
        if(first==last)
            System.out.println("First end last character are equal");
        else
            System.out.println("First end last character are not equal");
    }

    public static void main(String[] args) {
        Using_doWhile obj=new Using_doWhile();
        System.out.println("Start typing.....");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        do{
            obj.comp(str);
            str=null;
            str=s.nextLine();
        }
        while(!str.equals("done"));
        System.out.println("You Typed:-> done");
    }
}
