package Loop;

public class decreasing {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" * ");
            }


                    System.out.println();
                }
                for (int i = 1; i<= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        System.out.print("");
                    }

                }
                for (int l = 1; l <= n; l++) {
                    for (int j = 1; j <= l; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }


            for(int i=1;i<=5;i++){
                for (int j=5;j<=i;j++){
                    System.out.print("*");
                }
            }
        }
    }


