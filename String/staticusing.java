package String;

public class staticusing {

   public static void main(String[] args) {
       staticusing.reversedata();

   }
    static void reversedata() {

        String name = "java";

        for (int i = name.length() - 1; i >= 0; i--) {

            System.out.print(name.charAt(i));

        }


    }



  static   void anotherway(){

        String name1="angad";
        String reversedata="";

        for(int i = 0 ; i<=name1.length()-1; i++){

            char rev = name1.charAt(i);

              reversedata = rev + reversedata;
              
        }
      System.out.print(reversedata);

    }
}








