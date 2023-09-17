package pattern;

public class tringle {
    /*public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= n; i++) {
            //  System.out.println("*");
            for (int j = 0; j <= i; j++) {
                System.out.print("*222");
            }
            System.out.println();
        }
    }*/
/*    public static void main(String[] args) {
        int n=4;
        for(int i=n;i>=0;i--){
        //    System.out.print("8");
            for(int j=i;j<=0;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            // System.out.print("*");
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


        for (int i = 0; i <= 5; i++) {

            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

/*

            for (int m = 0; m <= 5; m++) {
                for (int j = m; j <= 5; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= 5; k++) {
                    System.out.println("*");
                }
                System.out.println(" ");
            }
*/

        }
    }}
