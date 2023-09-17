public class vaidya {
    void a(){
        int a=10;int b=20;int c=a+b;
        System.out.println(c);
    }
    int B(){
        int a=45;
        int b=4;
        int d=a+b;
        System.out.println(d);
        return 10;

    }
    boolean c(){
        int a=10;
        int b=25;
        int f=a+b;
        System.out.println(f);
        return true;
    }
    public static void main(String args[]){
        vaidya obj=new vaidya();
        obj.a();obj.B();obj.c();



    }

}