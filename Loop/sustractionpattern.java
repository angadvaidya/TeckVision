package Loop;

public class sustractionpattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 2 * n + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int l = 1; l <= 2 * n + 1; l++) {
            for (int k = l; k <= 2 * n - 1; k++) {
                System.out.print("  $ ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 2 * n + 1; i++) {
            for (int j = i; j <= 2 * n - 1; j++) {
                System.out.print(" $");
            }
            System.out.println();

            for (int m = 1; m <= n; m++) {
                for (int j = m; j <= n; j++) {
                    System.out.print(" & ");
                }
                System.out.println();
            }
        }
    }
}















