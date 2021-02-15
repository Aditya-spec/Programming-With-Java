//Write a program to print your Firstname,
// LastName & age using static block,static method & static variable respectively
public class Seventh {
    static{
        System.out.println("Aditya");
    }
    public static int age=24;
    public  static void printAge(){
        System.out.println(age);

    }

    public static void lastname(){
        System.out.println("Singh");
    }
    public static void main(String[] args) {
        Seventh.lastname();
        Seventh.printAge();
    }
}