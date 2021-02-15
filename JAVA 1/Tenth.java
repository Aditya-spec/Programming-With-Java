//Q10.Write a single program for following operation using overloading
//  A) Adding 2 integer number
//  B) Adding 2 double
//  C) multiplying 2 float
//  D) multiplying 2 int
//  E) concate 2 string
//  F) Concate 3 String
public class Tenth {
   public void overload(int a, int b , String s){
       int c=a+b;
       System.out.println("Sum of two integers is"+ c);
       ;
   }
    public void overload(double a, double b){
       double c= a+b;
       System.out.println("Sum of two double primitive numbers is"+ (a+b));

    }
    public void overload(float a, float b){
       float c=a*b;
        System.out.println("Multiplication of two float type numbers is");


    }
    public void overload(int a, int b){
       int c=a*b;
        System.out.println("Multiplication of two integers is"+ c);


    }
    public void overload(String a, String b){
       String c=a +b;
        System.out.println("Concatenation of two strings is"+ c);


    }
    public void overload(String a, String b,String c){
        String d = a +b+ c;
        System.out.println("Concatenation of three strings is"+ c);

    }
    public static void main(String[] args) {

        Tenth obj =new Tenth();
        obj.overload(5,6,"add");
        obj.overload(4.6,5.6);
        obj.overload(581216732.3234, 7.836849876836);
        obj.overload("Hello", "Java");
        obj.overload("Hello","Java" , "I am Intellij");
    }
}
