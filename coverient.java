public class coverient {
    coverient add(){
        return new coverient();
    }


}
class coverient1 extends coverient{
    coverient add(){
        return new coverient1();
    }

    public static void main(String[] args) {
        coverient s= new coverient1();
        System.out.println("hello sir");

    }

        }
