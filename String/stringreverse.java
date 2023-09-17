package String;

public class stringreverse {
    public static void main(String[] args) {
/*        String s = "vijay 11224";
        String rev = " ";
        for (int i = 0; i <= s.length() - 1; i++) {
            char ch = s.charAt(i);
            rev = ch+rev ;
            //    System.out.println(rev);
        }
        System.out.println(rev);
    }
}*/
       /*String str = "soham";
        char[] ch = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
*/


        String str = "soham";

        char[] chArr = str.toCharArray();

        System.out.println();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
/*
        System.out.println();
        StringBuffer sh=new StringBuffer(str);
        System.out.println(sh.reverse());



        StringBuildersr = new StringBuilder(str);
        System.out.println(sr.reverse());
*/

    }
}



