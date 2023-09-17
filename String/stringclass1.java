package String;

public class stringclass1 {
    public static void main(String[] args) {
        String g=new String("value");
        String g1=new String("value");
        String g2="value";
        String g3="value";
        System.out.println(g==g1);
        System.out.println(g2.equals(g3));
        System.out.println(g1==g);
        System.out.println(g3.equals(g2));
    }
}
