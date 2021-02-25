// Write a program to replace a substring inside a string with other string ?
public class First {

    public static void main(String[] args) {

        String old = new String("Hello, how are you?. Hope you are doing fine.");
        String newString = old.replace("are","ARE");
        System.out.println("OLD Strong: " + old);
        System.out.println("New String: " + newString);
    }
}
