package String;

public class hellojava {
   public static void main(String[] args) {
        String n=new String("hello java");
        String n1=new String("mangesh");
        String n2="hello java";
        String n3="hello java";
        System.out.println(n2.equals(n3));
        System.out.println(n2.equals(n1));
        System.out.println(n2.equals(n));
        System.out.println(n2.equals(args));
        System.out.println(n2.equals(null));
    }
/*public static void main(String[] args) {
    String n=new String("hello satish");
    String n1="HELLO SATISH";
    System.out.println(n1.equals(n));
    System.out.println(n1.equalsIgnoreCase(n));

}*/
}
