package oops;

public class Addition {
   public void elefant() {
        int a = 45;
        int b = 45;
        int sum = a + b;
       System.out.println(sum);
    }

    public int add() {
        int a = 22;
        int b = 45;
        return a + b;
    }
float k=3.0455684894656656848898F;
    float P() {
        float a = 45;
        float b = 45.68f;
        return a * b;
    }

    long S() {
        long a = 458;
        long b = 841;
        return a * b;
    }

    double R() {
        double a = 45;
        double b = 45;
        return a * b;
    }

    boolean T() {
        boolean a = true;

        boolean b = false;
        return true;
    }

    void H(int a, int b) {
        int ans = a + b;

    }

    int J(int a, int b) {
        return a / b;
    }

    float K(float a, float b) {
        return a - b;
    }

    long M(long a, long b) {
        return a + b;
    }

    double J(double a, double b) {
        return a + b;
    }

    boolean N(int  a, int b) {


        return a>b;
    }

    public static void main(String[] args) {
       Addition a=new Addition();
       int c=a.add();
        System.out.println(c);
        a.elefant();
        boolean s=a.N(40,30);
        System.out.println(s);
    }
}