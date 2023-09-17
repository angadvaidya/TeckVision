package inheritance;

import java.sql.SQLOutput;

public class Sambhaj {
    void class1(){
        String name="shamu";
        int age=52;
        int ammount=846455454;
        System.out.println("my property is give madh");
    }
}
class madhu extends Sambhaj{
    void class2(){
        String name="kaka";
        int  age=45;
        System.out.println("my property is give shahu");

    }

}
class shahu extends madhu {
    void class3() {
        String name = "somesh";
        int age = 35;
        System.out.println("my property is give om");
    }
}
class om extends shahu{


    public static void main(String[] args) {
        om ash=new om();
        ash.class1();
        ash.class2();
        ash.class3();
    }

    }