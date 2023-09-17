package multilevel;

public class bird {
    void nice(){
        int a=10;
        int b=25;
        int c=a*b;
        System.out.println(c);
    }
}
class Parrot extends bird{
    void nice1(){
        int a=25;
        int b =25;
        int c=a+b;
        System.out.println(c);


    }
}

class pickok extends Parrot {
    void nice2(){

        String name="vaidya";
        int age=45;
        System.out.println("name:"+name+  ""+age);
}
}
class hen extends pickok{
    void nice3() {
        String name = "shahu";
        int salary = 44564131;
        System.out.println("name:" + name + "" + salary);
    }


    }


class cock extends hen {
    void nice4(){}
    public static void main(String[] args){
        cock pig=new cock();
        pig.nice1();
        pig.nice2();
        pig.nice3();
        pig.nice4();
    };

}

