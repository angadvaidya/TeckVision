package constractore;

public class constructore1 {
    constructore1() {

        System.out.println("W");
    }

    static void constructore2() {
        System.out.println("hello");
    }
}
    class constr extends constructore1 {
        constr() {
            System.out.println("k");

        }
            public static void main (String[]args){
            constr j=new constr();
            constructore2();



        }



}
