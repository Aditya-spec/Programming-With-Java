package Question_Seventh;
//Override the default method of the interface.
interface myInterface{
    public default void display(){
        System.out.println("Interface's default method");
    }
}
public class Main implements myInterface {
    public void display() {
        System.out.println("display method of class");
    }
    public static void main(String[] args) {
        Main main=new Main();
        main.display();
    }
}
