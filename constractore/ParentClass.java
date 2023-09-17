package constractore;

import inheritance.Parent;
class Tiger1 {
    Tiger1() {
        System.out.println("african");
    }

    Tiger1(int a, int waight, float rsf) {
        System.out.println("tiger of the high powerfull");
    }

    Tiger1(int a, int b) {
        this(5, 869, 456f);
        System.out.println("there is not leazy");
    }

    Tiger1(int a) {
        this(5, 5);

        System.out.println("same as use");
    }
}
    class bafelo extends Tiger1 {
        bafelo(int a, float weight) {
            super(5);
            System.out.println("bafelo is nor weighted");
        }

        bafelo(long res, int a, String n) {
            this(5, 89);
            System.out.println("bafelo is high speed of tiger");
        }

        bafelo(String n) {
            this(545345, 454, "madhav");
            System.out.println("hello bai");

    }
    }
public class ParentClass extends  bafelo {
    ParentClass() {
        super("himesh");
        System.out.println("hello frends");
    }

    void ParentClass() {
        System.out.println("ok every one");
    }

    void ParentClass(int a, float b) {
        System.out.println("hi frends");
    }

    public static void main(String[] args) {
        ParentClass D = new ParentClass();
        D.ParentClass();
    }
}


