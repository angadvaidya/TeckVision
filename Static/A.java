package Static;

public class A {
    void m1(){
        System.out.println("hi");
    }
    A(A a){
        m1();
        System.out.println("java");
    }

    public static void main(String[] args) {
        A a =new A (null);

    }
}
