package multilevel;

class Parent{
    void show (){
        System.out.println("calling parent ");
    }


}
class Child extends Parent{
    void show(){
        System.out.println("clling chaild class");


    }
    void display(){
        System.out.println("display calling ");

    }
    void work(){
        show();
        display();

    }

    public static void main(String[] args) {
        Child harry=new Child();
        harry.work();
    }


}