package abcd;

public class inheritance {
    int show(){
        System.out.println("hi");
        return 1;
    }
}
class asd extends inheritance{
    double disply()
    {
        System.out.println("hey");
        return 5;
    }

}
class abb extends asd{
    String sho(){
        System.out.println("tom");
        return "";
    }

}
class aa extends abb{

    void a(){};

    public static void main(String[] args) {
       aa v =new aa();
       v.show();
       v.sho();
    }

}
