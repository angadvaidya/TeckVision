package Static;

public class staticSnapt {
    private int x=10;
    static int m1(){
        staticSnapt a=new staticSnapt();
        int y=a.x;
        return y;

    }
    public static void main(String[] args){
        System.out.println(m1());

    }
}
