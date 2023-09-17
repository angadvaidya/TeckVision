public class casting{
    casting(){
        System.out.println("achitum valubam ");
    }
}
class casting1 extends casting{
    casting1(){
        System.out.println("keshavam ");
    }
}
class casting2 extends casting1{
casting2(){
    System.out.println("krinsha hare hare");

}
}
class casting3 extends casting2 {
    casting3() {
        System.out.println("madhavam keshavam narayan");
    }

}
class casting5 extends casting3{
    casting5(){
        System.out.println("prented of all word");
    }

    public static void main(String[] args) {
        casting M=new casting5();
        casting5 N=(casting5)new casting();
    }

}
