package Question_Fourth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    Double age;
    Double salary;
    String name;

    public Employee(Double age, Double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
class Sortbysalary implements Comparator<Employee>
{

    public int compare(Employee a, Employee b)
    {
        return (int) (b.salary - a.salary);
    }
}
public class Fourth {
    public static void main(String[] args) {
        List<Employee> employee =new ArrayList<Employee>();
        employee.add(new Employee(28.0,56000.00,"Bravo"));
        employee.add(new Employee(21.0,49500.00,"Echo"));
        employee.add(new Employee(26.0,135000.00,"Delta"));
        employee.add(new Employee(25.0,90000.00,"Charlie"));
        employee.add(new Employee(32.0,36000.00,"Alpha"));
        employee.add(new Employee(40.0,96000.00,"Mike"));
        Collections.sort(employee, new Sortbysalary());
        employee.forEach(System.out::println);
    }
}
