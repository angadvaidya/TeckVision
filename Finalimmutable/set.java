package Finalimmutable;

public class set {
    void and(String str) {
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            reverse=ch+reverse;
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        set s=new set();
        s.and("java");

    }
}
