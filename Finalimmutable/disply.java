package Finalimmutable;

public class disply {
    public static void main(String[] args) {
    show();
    }
        public static void show(){
        String str="vaidya";
            String reverse = "";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                reverse = ch + reverse;
            }
            System.out.println(reverse);
        }
    }


