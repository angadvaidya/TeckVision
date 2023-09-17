package inheritance;

public class parentc {
    int show(int a){
        System.out.println("A");
        return 1;
    }

}
class mango extends parentc{
    void show(double b){
        System.out.println("B");

    }

}
class jush extends mango{
    float show(){
        System.out.println("c");
        return 1;
    }

    public static void main(String[] args) {
        jush j=new jush();
        j.show();
        j.show(5);
        j.show(9);
    }

}