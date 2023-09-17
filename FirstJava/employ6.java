package FirstJava;

public class employ6 {
    private int id;
    private String F;
    private String M;
    private String L;
    private double Salary;
    private String add;

    public employ6(int id, String f, String m, String l, double salary, String add) {
        this.id = id;
        F = f;
        M = m;
        L = l;
        Salary = salary;
        this.add = add;
    }

    @Override
    public String toString() {
        return "employ6{" +
                "id=" + id +
                ", F='" + F + '\'' +
                ", M='" + M + '\'' +
                ", L='" + L + '\'' +
                ", Salary=" + Salary +
                ", add='" + add + '\'' +
                '}';
    }

    public static void main(String[] args) {
        employ6 A=new employ6(5,"shravan","madhavrao","wagh",8500000,"naleshore");
        System.out.println("employ details"+A.toString());
    }
}
