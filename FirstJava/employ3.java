package FirstJava;

public class employ3 {
    private int id;
    private String F;
    private String M;
    private String L;
    private String add;
    private double salary;

    public employ3(int id, String f, String m, String l, String add, double salary) {
        id = id;
        F = f;
        M = m;
        L = l;
        add = add;
        salary = salary;
    }

    @Override
    public String toString() {
        return "employ3{" +
                "id=" + id +
                ", F='" + F + '\'' +
                ", M='" + M + '\'' +
                ", L='" + L + '\'' +
                ", add='" + add + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        employ3 M=new employ3(2,"nikhil","ananda","vaidya","asarjan",8500000);
        employ3 N=new employ3(3,"kapil","ananda","vaidya","asarjan",454565587);
        System.out.println("employ number 3"+M.toString());
        System.out.println("employ number 4"+N.toString());
    }
}
