package Question_Fourth;
//Create an Employee Class with instance variables (String) name, (Integer)age,
// (String)city and get the instance of the Class using constructor reference

interface MyInterface {
    public Employee get(String str1,int num, String str2);
}
class Employee{
    private String name;
    private int age;
    private String city;

    public Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
        System.out.println(this.name+":"+this.age+":"+this.city);
    }

}
public class Main {
    public static void main(String[] args) {
       MyInterface employee=Employee::new;
       employee.get("Aditya",24,"Delhi");
        employee.get("Raman",27,"Bangalore");
        employee.get("Karan",21,"Jaipur");
    }
}
