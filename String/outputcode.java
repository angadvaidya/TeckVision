package String;

public class outputcode {
    public static void main(String[] args) {
        String s=new String("java");
        String s1=new String("java");
        String s3="java";
        String s4="java";
        System.out.println("enter the String in heap memberi  "+s1.equals(s));
        System.out.println("enter the String in new   "+s1.equals(s3));
        System.out.println("enter the String the "+s1.equals(s4));
        System.out.println("enter the String the "+s1.equals(null));
        System.out.println("enter the String "+s1.equals(args));
    }
}
