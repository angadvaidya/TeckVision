package Loop;

public class forloop {
    public static void main(String[] args) {
        String n = "vaidya";
     String reverse=" ";
        for(int i=0;i<=n.length()-1;i++) {
          //  String reverse = " ";
            char ch = n.charAt(i);
            //  String reverse=" ";
            reverse = ch + reverse;


            System.out.print(reverse);
        }
    }


}
