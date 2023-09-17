package pattern;

public class tringle2 {
    public static void main(String[] args) {
        int n = 5;
         for (int i = 1; i <= n; i++) {
            for (int j=i; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int l=1;l<=n;l++)
        {
            for(int k=1;k<=l;k++)
            {
                System.out.print("& ");
            }
            for(int h=1;h<=n;h++)
                for(int g=h;g<=h;g++){
                    System.out.print(" ");
                }
            System.out.println();
        }

    }
}
