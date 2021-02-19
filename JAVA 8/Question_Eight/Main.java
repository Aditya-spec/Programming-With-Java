package Question_Eight;
// Implement multiple inheritance with
// default method inside  interface.
interface Interface1{
    public default void display(){
        System.out.println("Interface1");
    }
    public default void show(){
        System.out.println("Show Interface1");
    }
}
interface Interface2{
    public default void display(){
        System.out.println("Interface2");
    }
    public default void show(){
        System.out.println("Show Interface2");
    }
}

public class Main implements Interface1, Interface2{

    public  void display(){
        System.out.println("Class has to provide implementation for the same methods");
    }
    public void show(){
        Interface1.super.show();
        Interface2.super.show();

    }
    public static void main(String[] args) {
        Main main=new Main();
        main.display();
        main.show();
    }
}
