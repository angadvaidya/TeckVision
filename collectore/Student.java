package collectore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    int id;
    String name;
    double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Student(int id, String name, double salry){
this.id=id;
this.name=name;
this.salary=salry;
    }

    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "ak", 454546));
        students.add(new Student(2, "akash", 454545));
        students.add(new Student(3, "ajay", 454545));
        students.add(new Student(5, "akanshya", 454545));
        students.add(new Student(6, "saurab", 454545));
        students.add(new Student(7, "shubham", 454545));
        students.add(new Student(8, "akshay", 454545));
        students.add(new Student(9, "archena", 454545));
        students.add(new Student(10, "kaliya", 454545));
        students.add(new Student(11, "kaithamakal", 454545));



        List<Student>top3student=students.stream().sorted(Comparator.comparingDouble(Student::getSalary).
                reversed()).limit(5).collect(Collectors.toList());
        System.out.println(top3student);

    }

    }


