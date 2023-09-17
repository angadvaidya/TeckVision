package encapsulation;

public class Student_SSS {
    private String f;
    private String l;
    private int roll;
    private long mobil;

    Student_SSS() {

    }

    Student_SSS(String f, String l, int roll, long mobil) {
        System.out.println("mechanical wrap up the veriable data and method together single unit");
    }

    public String getF() {
        return f;
    }

    public String getL() {
        return l;
    }

    public int getRoll() {
        return roll;
    }

    public long getMobil() {
        return mobil;
    }

    public String setF(String F) {
        return f;
    }

    public String setL(String L) {
        return l;
    }

    public int getRoll(int roll) {
        return roll;
    }

    public long getMobil(long mobil) {
        return mobil;
    }
}

    class display {
        public void main(String[] args) {
            Student_SSS s=new Student_SSS();
            s.getF();
            s.setF("vijay");
            System.out.println(s.setF("vijay"));

        }

    }




