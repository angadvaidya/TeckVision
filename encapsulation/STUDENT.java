package encapsulation;

public class STUDENT {
    int Roll_No;
    String name;
    String lastname;
    String college;
    String address;
    long Mo_No;

    public STUDENT(int roll_No, String name, String lastname, String college, String address, long mo_No) {
        this.Roll_No = roll_No;
        this.name = name;
        this.lastname = lastname;
        this.college = college;
        this.address = address;
        this.Mo_No = mo_No;
    }

    public STUDENT() {

    }

    public void setRoll_No(int roll_No) {
        Roll_No = roll_No;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMo_No(long mo_No) {
        Mo_No = mo_No;
    }

    public int getRoll_No() {
        return Roll_No;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCollege() {
        return college;
    }

    public String getAddress() {
        return address;
    }

    public long getMo_No() {
        return Mo_No;
    }

    @Override
    public String toString() {
        return "STUDENT{" +
                "Roll_No=" + Roll_No +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", college='" + college + '\'' +
                ", address='" + address + '\'' +
                ", Mo_No=" + Mo_No +
                '}';
    }

    int disp(int Roll_No, String name, String lastname, String college, long Mo_No){
        System.out.println("Student Details  "+1 +"\n "+name+"\n"+lastname+"\n"+college+"\n"+Mo_No);
        return 7;


    }

    public static void main(String[] args) {
        STUDENT S=new STUDENT();
        S.disp(1,"satish","Bhanushali","shankarrao" ,8775645358l);
        S.disp(2,"shubham","bargal","shankarrao" ,877564455323l);


    }
}
