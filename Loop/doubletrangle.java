package Loop;

public class doubletrangle {


    public static void main(String[] args) {
        int n = 5;


        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("& ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("__");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("& ");
            }
            System.out.println();
        }

        for (int l = 1; l <= n; l++) {
            for (int j = l; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= l; j++) {

                System.out.println();
            }
        }
    }
}
