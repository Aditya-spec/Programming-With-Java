package Question_Sixth;
//Create and access default and static method of an interface.
interface myInterface{
    public static void displaystatic() {
        System.out.println("Static method of myInterface");
    }
    public default void displaydefault() {
        System.out.println("display method of myInterface");
    }
}
public class Main implements myInterface {
    public static void main(String[] args) {
        Main main=new Main();
        main.displaydefault();
        myInterface.displaystatic();
    }
}
