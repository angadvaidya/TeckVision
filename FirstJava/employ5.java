package FirstJava;

public class employ5 {
    private String f;
    private String m;
    private String l;
    private String Add;
    private String State;
    private int id;
    private double salary;

    public employ5(String f, String m, String l, String add, String state, int id, double salary) {
        this.f = f;
        this.m = m;
        this.l = l;
        Add = add;
        State = state;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employ5{" +
                "f='" + f + '\'' +
                ", m='" + m + '\'' +
                ", l='" + l + '\'' +
                ", Add='" + Add + '\'' +
                ", State='" + State + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        employ5 name=new employ5("ashok","madhavrao","wagh","naleshor","maharastra",45,8000000);
        System.out.println("value of employ"+name.toString());


    }
}
