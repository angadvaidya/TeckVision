package Loop;

public class tringleloop {
    public static void main(String[] args) {
        int n = 5;
        for (int i =0;i<=n;i++) {
            System.out.print(" ");

            for (int j = 0;j<=i;j++) {
                if (j == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


        for (
                int i = 0; i <= n; i++) {
            for (int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=i;j<n;j++){
                if(j==i)
                    System.out.print("*");
                else System.out.print(" ");
            }
            for (int j=i;j<=n;j++){
                if(j==n)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();

        }
    }
}
