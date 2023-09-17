package multilevel;

public class word {
    void T1(){
     int a=5*5;
        System.out.println(a);
    }
}
class word1 extends word{
    void T2(){
        float b=(float)4.5;
        System.out.println(4.5);
    }

}

class word2 extends word1 {
    void T3() {
        double a = 25 * 6;
        System.out.println(a);
    }
}

class word3 extends word2 {
    void T4() {
        boolean a = true;
        System.out.println("true");

    }
}
class word4 extends word3{
    void T5(){
        System.out.println();
    }

    public static void main(String[] args) {
        word4 A=new word4();
        A.T1();
        A.T2();
        A.T3();
        A.T4();

    }

}



