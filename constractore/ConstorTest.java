package constractore;
class present{
    present(){

        System.out.println("good job");
    }
    present(int a,float b,long c){
        this();
        System.out.println("very very good");
    }
    present(String n){
        this(23,45.6f,5646576l);
        System.out.println("go to back");
    }
}
class ParentConst extends present{
    ParentConst(){
        super("sourab");

        System.out.println("use in flow");
    }

    ParentConst(int age,int salary){
        this();
        System.out.println("parent class:");
    }
    ParentConst(String name,int age,int salary){
        this (25,5845321);
        System.out.println("child class");
    }
    ParentConst(String name,int week){
        this("om",25,452155);
        System.out.println();
    }
        ParentConst(int a,int b,int c){
        this("same",45);
        System.out.println("parant class default constructor");
    }
ParentConst(int a){
        this(25,26,54);
        System.out.println("Parent const");
        }
ParentConst(String name){
    this (25);
    System.out.println ("parent class with Int parameterized constructor");
        }
        }

public class ConstorTest extends ParentConst {
    ConstorTest(){
        super("anghad");
        System.out.println("this is constructor");
    }
    void ConstorTest(){
        System.out.println("this is method");
    }

    public static void main(String[] args) {
        ConstorTest test=new ConstorTest();
        test.ConstorTest();
    }

}
