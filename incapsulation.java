public class incapsulation {
     incapsulation(){
        System.out.println("enter the value");

    }
}
class incpasulation1 extends incapsulation {
    incpasulation1() {
        int a=45;
        System.out.println("eter the name"     +a);
        return;

    }

}
class incapsulation2 extends incpasulation1 {
    incapsulation2(int a, String n) {
        System.out.println("hello friends");

    }

}
class incapsulation3 {
    public static void main(String[] args) {
        incapsulation name=new incapsulation2(4544,"sh");//inclicity
        incapsulation2 na=(incapsulation2)new incapsulation();

    }


}







