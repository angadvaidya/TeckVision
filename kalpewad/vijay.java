package kalpewad;

abstract class Bike1{
   abstract void run();



}
class Honda4 extends Bike1{
    void run(){
        System.out.println("bike is running safty");

    }

    public static void main(String[] args) {
        Bike1 A=new Honda4();
        A.run();
    }

}

