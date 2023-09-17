package pattern;

public class plussingn {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
                for (int l = 0; l <= n; l++) {
                    for (int m = l; m >= n; m--) {
                        System.out.print(" $");
                    }

                }
                System.out.println("");

            }
            for (int k = 0; k <= n; k++) {
                for (int b = k; b <= n; b++) {
                    if(k==b||k+b==n+1)
                    System.out.print("*");
                    else System.out.println(" ");
                }

                System.out.println();
            }
        }
    }

