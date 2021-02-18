//Write a program to sort the Student objects based on Score ,
// if the score are same then sort on First Name .
// Class Student{ String Name; Double Score; Double Age
package Question_Fifth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    Double age;
    Double score;

    public Student(String name, Double age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student student) {
if(this.score>student.score)return -1;
else if(this.score<student.score) return 1;
        return this.name.compareTo(student.name);
    }
}
public class Fifth {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<Student>();
        students.add(new Student("Echo",23.0,69.0));
        students.add(new Student("Charlie",23.0,45.0));
        students.add(new Student("Alpha",22.0,68.0));
        students.add(new Student("Delta",24.0,69.0));
        students.add(new Student("Mike",23.0,56.0));
        students.add(new Student("Bravo",24.0,45.0));
        Collections.sort(students);
        students.forEach(System.out::println);
    }
}
