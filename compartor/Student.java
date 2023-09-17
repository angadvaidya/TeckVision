package compartor;

import java.util.ArrayList;
import java.util.List;

class Student {
    private int Roll_no;
    private String F_name;
    private String M_name;
    private String L_name;
    private String Address;
    private double Mo_No;
    private int age;

    public Student(int roll_no, String f_name, String m_name, String l_name, String address, double mo_No, int age) {
        this.Roll_no = roll_no;
        this.F_name = f_name;
        this.M_name = m_name;
        this.L_name = l_name;
        this.Address = address;
        this.Mo_No = mo_No;
        this.age = age;
    }

    public int getRoll_no() {
        return Roll_no;
    }

    public void setRoll_no(int roll_no) {
        Roll_no = roll_no;
    }

    public String getF_name() {
        return F_name;
    }

    public void setF_name(String f_name) {
        F_name = f_name;
    }

    public String getM_name() {
        return M_name;
    }

    public void setM_name(String m_name) {
        M_name = m_name;
    }

    public String getL_name() {
        return L_name;
    }

    public void setL_name(String l_name) {
        L_name = l_name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getMo_No() {
        double moNo = Mo_No;
        return moNo;
    }

    public void setMo_No(long mo_No) {
        Mo_No = mo_No;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Roll_no=" + Roll_no +
                ", F_name='" + F_name + '\'' +
                ", M_name='" + M_name + '\'' +
                ", L_name='" + L_name + '\'' +
                ", Address='" + Address + '\'' +
                ", Mo_No='" + Mo_No + '\'' +
                ", age=" + age +
                '}';
    }

    void Student(){

    }

    public static void main(String[] args) {
        Student name=new Student(1,"satish","ganesh","bhanushali","nanded",48454545454d,29);
        Student name1=new Student(2,"vijay","abcd","kadpevad","umerkhade",7874845465465d,27);
        Student name2=new Student(3,"shrikant","haribhau","more","lature",45646552,32);
        Student name3=new Student(4,"satish","gangadhar","bakal","jaybhavaninager",89789785454d,31);
        Student name4=new Student(5,"deelip","bhanudas","vaidya","krantinager",12154444546d,28);
        Student name5=new Student(6,"madhav","madhukar","jadhav","asarjan",5456432121d,30);

        List<Student>students=new ArrayList<Student>();
        students.add(name);
        students.add(name1);
        students.add(name2);
        students.add(name3);
        students.add(name4);
        students.add(name5);
        System.out.println(students);







    }

}
