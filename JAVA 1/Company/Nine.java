package Company;
////Write a program to display values of enums using
// a constructor & getPrice() method (Example display house & th
public class Nine {
    public static void main(String[] args) {
//Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
        System.out.println("All House prices:");
        for (House c : House.values())
            System.out.println(c + " costs " + c.getPrice() + " Rupees.");


    }
}
