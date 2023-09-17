package abcd;

public class constructor {
    int constructor()
    {
        this.constructor(1,5);
        System.out.println("hello java");
        return 1;
    }
    double constructor(int a,int b){

        System.out.println("hello friend");
        return 2;

    }


}
class abc extends constructor{
    int abc(double a,int b){
        super.constructor();
        System.out.println("hey gys");
        return 5;
    }
    double abc(String a,double b){
        this.abc(1.1,6);
        System.out.println("hey you");
        return 0.2;
    }

    public static void main(String[] args) {
        abc av=new abc();
       av.abc("av",5.4);

    }

}
