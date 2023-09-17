package pattern;

public class patterndia {
    public static void main(String[] args) {
        int i;
        int n=5;
        int j;
        for(i=0;i<n;i++){
            for(j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(i=0; i<=n;i++){
            for(j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(j=i;j<=n;j++){
                System.out.print(" *");
            }
            System.out.println();
        }


        }
    }

