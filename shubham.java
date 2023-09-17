public class shubham {
    void add(){
        int a=10;
        int b=25;
        int c=a+b;
        System.out.println(c);
    }
}
class V1 extends shubham{
    void div(){
        int a=10;
        int b=25;
        int c=a/b;
        System.out.println(c);

    }

}
class V2 extends V1{
    void sub(){
        int a=10;
        int b=25;
        int c=a-b;
        System.out.println(c);

    }

}
class V3 extends V2{
    void mult(){
        int a=10;
        int b=25;
        int c=a*b;
        System.out.println(c);
    }

}
class V4 extends V3{
    void div(){

    }

    public static void main(String[] args) {

        V4 V5=new V4();
        V5.add();
        V5.mult();
        V5.sub();
        V5.div();
    }

}