package kalpewad;

abstract class soham {
    int a;
    float b;
   abstract void sp();
}
class abcd extends soham{

    @Override
    void sp() {

    }

    void sp1(){
        int a=10;
        int b=20;
        int ans=a+b;
        System.out.println(ans);

    }

}
class abst extends abcd{
    void sp2(){
        float a=25.5f;
        float b=45.5f;
        float c=(float)a*b;
        System.out.println("enter the value of float:"+c);
    }

}
class abstr extends abst{
    float sp5() {
        int a = 45;
        float b = 78.5f;
        float c = a + b;
        System.out.println("enter the float value:" + c);
        return 4.5f;
    }
    }

    class shanker extends abstr {
        void soham1() {
            System.out.println();
        }

        public static void main(String[] agrs) {
            shanker A = new shanker();
            A.soham1();
            A.sp5();
            A.sp1();
            A.sp();
            A.sp2();

        }
    }




