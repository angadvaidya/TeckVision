package Mapping.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    int id;
    String name;
    String lastname;

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(int id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    public static void main(String[] args) {
        Student s1=(new Student(1,"vijay","kadpawade"));
        Student s2=(new Student(2,"saurab","patil"));
        Student s3=(new Student(3,"shubham","patil"));
        ArrayList<Student>students=new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Map<Integer,String> H=new HashMap<>();
        for(Student o:students){
            H.put(o.getId(),o.getName());
        }
        System.out.println(H);


    }
}
