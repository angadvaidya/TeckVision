package arithmetic;

public class heirarchical1 {
    int a = 10;
    int b = 20;
    int c = 20;

    void show() {
        System.out.println("enter the value:");
    }
}

class heirarchical2 extends heirarchical1 {
    void show5(){
        int d=a*b;
        System.out.println("enter the value"+d);
    }

}
class heirarchical3 extends heirarchical1{
    void show2(){
        int c='a'+'b';
        System.out.println("enter the value:"+c);
    }

}
class heirarchical4 extends heirarchical1 {
    void show3() {
        System.out.println("enter the value;" + 'a');
    }

    public static void main(String[] args) {
        heirarchical4 A=new heirarchical4();
        heirarchical2 B=new heirarchical2();
        A.show3();
        A.show();
       B.show5();

    }

}
