package String;

public class Stringrevers {
/*
    static public void main(String[] args) {

        String a = "vaidya 123456";
        String rev = " ";
        for (int i = 0; i <= a.length() - 1; i++) {
            char ch = a.charAt(i);
            rev = ch + rev;
        }

        System.out.println("enter the revers " + rev);
    }

}
*/


    public static void main(String[] args) {
        String s = "radha Patil";
        //for (int i = s.length() - 1; i >= 0; i--) {
        for(int i=0;i<s.length()-1;i++){
            System.out.println(s.charAt(i));
        }

    }
}







