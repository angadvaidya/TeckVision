package constractore;
class kohli {
    kohli() {
        System.out.println("india creater player");
    }

    kohli(String j,int a) {
        this(5, 5454f, "panday");
        System.out.println("kohali is high record");
    }

    kohli(int a, float b, String n) {
this();

        System.out.println("kohali is big running and record");
    }
}

class dhoni extends kohli {
    dhoni(){
        super("soham",8);
        System.out.println("hello dhoni");
    }
    dhoni(int a){
        this(45,"sonham");
        System.out.println("very very nice batting");
    }
    dhoni(int a,String n){
        this("sham",784512132154l,656456454.986563535);
        System.out.println("dhoni is creater player");
    }
    dhoni(String a,long b,double c){
this();
        System.out.println("doni is chenai kepper");
    }
}
public class om extends dhoni{
    om(){
        super(5);
        System.out.println("hello sir");
    }
    void om(){
        System.out.println("i am comming");
    }

    public static void main(String[] args) {
        om namo=new om();
        namo.om();
    }
}
