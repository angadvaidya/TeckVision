package String;
class A{
    final static int a=10;
     final int b=20;
    void methodOne(){

        final int c=a+b;
        System.out.println(c);
    }

        public static void main(String[] args) {
            A ab=new A();

            ab.methodOne();
        }
    }





