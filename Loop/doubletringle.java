package Loop;

public class doubletringle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
                for (int l = 0; l <= n; l++) {
                    for (int k = n; k <= l; k++) {
                        System.out.print("*");
                    }
                    System.out.print( "_" );
                }
                System.out.println();

            }}}}



