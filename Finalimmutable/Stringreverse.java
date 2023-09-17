package Finalimmutable;

public class Stringreverse {

    public static void main(String[] args) {
        String s="vaidya";
        String reverse=" ";

        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            reverse=ch+reverse;
         //   System.out.println(reverse);
        }
      System.out.println(reverse);
    }
}
