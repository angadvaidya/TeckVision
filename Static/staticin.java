package Static;

public class staticin {
    private static int x=10;
    static int m1(){
        int y=x;
        return y;
    }

    public static void main(String[] args) {
        m1();
    }
}
