package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

class FirstnameComparator implements Comparator<employ1> {

    @Override
    public int compare(employ1 o1, employ1 o2) {
        return o1.getFirst_name().compareTo(o2.getFirst_name());
    }
}

class SalaryComparator implements Comparator<employ1>{

    @Override
    public int compare(employ1 o1, employ1 o2) {
        if(o1.getSalary()>o2.getSalary())
            return 1;
        else if (o1.getSalary()< o2.getSalary()) {

        }
        {

        }
        return 0;
    }
}

public class employ1 implements Comparable<employ1>{
    public Object getMiddleName;
    private int roll;
    private String First_name;
    private String Middle_name;
    private String Last_name;
    private double salary;
    private int age;
    private String address;
    private Date name;

    public Object getGetMiddleName() {
        return getMiddleName;
    }

    public void setGetMiddleName(Object getMiddleName) {
        this.getMiddleName = getMiddleName;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getMiddle_name() {
        return Middle_name;
    }

    public void setMiddle_name(String middle_name) {
        Middle_name = middle_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getName() {
        return name;
    }

    public void setName(Date name) {
        this.name = name;
    }

    public employ1(int roll, String first_name, String middle_name, String last_name, double salary, int age, String address) {
        this.roll = roll;
       this. First_name = first_name;
       this. Middle_name = middle_name;
       this. Last_name = last_name;
        this.salary = salary;
        this.age = age;
        this.address = address;
    }

    public employ1() {


    }



    @Override
    public String toString() {
        return "employ1{" +
                "roll=" + roll +
                ", First_name='" + First_name + '\'' +
                ", Middle_name='" + Middle_name + '\'' +
                ", Last_name='" + Last_name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(employ1 o) {
        return this.name.compareTo(o.name);
    }

    public String getMiddleName() {
        return Middle_name;
    }
}

class employ2 {
    public static void main(String[] args) {
        employ1 s1 = (new employ1(1, "ashok", "madhavarao", "wagh", 850000, 25, "nanded"));
        employ1 s2=(new employ1(2,"shrawan","madhavarao","wagh",650000,26,"solapur"));
        employ1 s3=(new employ1(3,"vijay","marotrao","kadpewad",550000,27,"delhi"));
        employ1 s4=(new employ1(4,"saurab","s","patil",350000,28,"lature"));
        employ1 s5=(new employ1(5,"shubham","madhav","biradger",600000,29,"kolapure"));
        employ1 s6=(new employ1(6,"akash","sham","biragedar",400000,30,"naleshor"));
        employ1 s7=(new employ1(7,"om","yeshawadnt","wagh",450000,22,"panjab"));
        employ1 s8=(new employ1(8,"sham","sheserao","vaidya",440000,35,"bangal"));
        employ1 s9=(new employ1(9,"kailash","ganpat","vaidya",50000,40,"asarjan"));

        ArrayList<employ1> list = new ArrayList<employ1>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);
        list.add(s9);
        SalaryComparator h=new SalaryComparator();
        Collections.sort(list,h);
        System.out.println(list);



       // Collections.sort(list);
       // System.out.println(list);
      //  FirstnameComparator b=new FirstnameComparator();
       // Collections.sort(list,b);
       // System.out.println(list);
      //  for(employ1 p:list){
      //      System.out.println(p);
        }

     //   for(employ1 s:list){
      //      System.out.println(s);
        }












