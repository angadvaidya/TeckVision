package multilevel;

public class myclass {
    void pen(){
         String name="shradh";
         int a=5;
         int b=8;
        System.out.println("shardh say i want to 5 pen");

    }
}
class Myclass1 extends myclass {
    void T()

    {
        String name = "sourab";
        String Name = "patise";
        int a = 45;
        System.out.println("sourab say i want to eat patise");

    }
}
class Myclass2 extends Myclass1 {
    void T2(){
        String name = "shubham";
    String Name = "dhosa";
    System.out.println("shubham i want to eat dhosa");
}
}
class Myclass3 extends Myclass2 {
    void T3() {
        String name = "shamu";
        String Name = "vadapav";
        System.out.println("shamu hello we are all eat vadapav ");

    }
}

class Myclass4 extends Myclass3{
    void T4()

    {
        String name = "akash";
        String Name = "etali";
        System.out.println("akash say  i dont want you continue");


    }
}
class Myclass5 extends Myclass4{
    void T5() {
        String name = "ram";
        System.out.println("ram say all leave now i am hangree ");
    }
    public static void main(String[] args) {

        Myclass5 hay = new Myclass5();
        hay.T2();
        hay.T3();
        hay.T4();
        hay.pen();
        hay.T5();
    }

}
