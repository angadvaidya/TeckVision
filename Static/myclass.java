package Static;

public class myclass {
    static int a=20;
    myclass (){
         a=200;
    }

    public static void main(String[] args) {
        new myclass();
        System.out.println(a);

    }
}
