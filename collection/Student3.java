package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class FnameCompartor implements Comparator<Student3>{

    @Override
    public int compare(Student3 o1, Student3 o2) {
        return o1.getFname().compareTo(o2.getFname());
    }
}

public class Student3 implements Comparator<Study> {
    private int roll;
    private String Fname;
    private String Mname;
    private String Lname;
    private  double per;
    private String gread;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getMname() {
        return Mname;
    }

    public void setMname(String mname) {
        Mname = mname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

    public String getGread() {
        return gread;
    }

    public void setGread(String gread) {
        this.gread = gread;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "roll=" + roll +
                ", Fname='" + Fname + '\'' +
                ", Mname='" + Mname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", per=" + per +
                ", gread='" + gread + '\'' +
                '}';
    }

    public Student3(int roll, String fname, String mname, String lname, double per, String gread) {
        this.roll = roll;
        this.Fname = fname;
       this. Mname = mname;
       this. Lname = lname;
        this.per = per;
        this.gread = gread;

    }

    Student3(){

    }

    @Override
    public int compare(Study o1, Study o2) {
        return 0;
    }
}
class Study{
    public static void main(String[] args) {
        Student3 d1=new Student3(1,"ashok","yeshawant","wagh",85.00,"A");
        Student3 d2=new Student3(2,"om","yeshwant","wagh",98.00,"firstclass");
        Student3 d3=new Student3(3,"asha","yeshwant","wagh",95.00,"firstclass");
        Student3 d4=new Student3(4,"archana","yeshwant","wagh",86.00,"B");
        Student3 d5=new Student3(5,"shravan","madhav","wagh",91.00,"firstclass");
        Student3 d6=new Student3(6,"sham","jalaba","vaidya",65.00,"C");
        ArrayList<Student3>hp=new ArrayList<Student3>();
        hp.add(d1);
        hp.add(d2);
        hp.add(d3);
        hp.add(d4);
        hp.add(d5);
        hp.add(d6);
        FnameCompartor n=new FnameCompartor();

        Collections.sort(hp,n);
            System.out.println(hp);
        }








    }







