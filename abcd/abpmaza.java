package abcd;

public class abpmaza {
    int a=10;
    int b=20;
    int show ()
    {


            a=b+a;
            b=a-b;
            a=a-b;
       System.out.println(a);
        System.out.println(b);
           return 1;
        }


    public static void main(String[] args) {
        abpmaza a=new abpmaza();
        a.show();
    }

}
