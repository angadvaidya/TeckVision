package ExceptionHandling;

public class throws1 {
    int get() {
       try{ int a=10;
        int b=0;
        return 30;
    }
       catch (ArithmeticException e){
           return  50;

       }finally {
           return 99;
       }
       }

    public static void main(String[] args) {
        throws1 t=new throws1();
        t.get();

    }
}
