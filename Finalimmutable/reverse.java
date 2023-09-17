package Finalimmutable;

public class reverse /*{
    public static void main(String[] args) {
        String s="vaidya angad";
    }
        String reverse = " ";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
                    reverse=ch+reverse;
         //   System.out.println(reverse);
        }
        System.out.println(reverse);



}*/ {
    public static void main(String[] args) {
        String a = "vaidya angad";
        String reverse = " ";
        for (int i = a.length() - 1; i >= 0; i--) {
            char ch = a.charAt(i);
            reverse = reverse + ch;
            //    System.out.println("geel   " + reverse);
        }

        System.out.println(reverse);

    }

}