package Loop;

public class Butterfly {
    public static void main(String []args){
        int n=5;
        int i,j;
        for(i=0;i<n;i++ ){
            for (j=0;j<i;j++){
                System.out.print("* ");
            }
            for (j=i;j<n;j++){
                System.out.print("    ");
            }
           /* for (j=i;j<n;j++){
                System.out.print("  ");
            }*/
            for (j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
        for(i=0;i<n;i++ ){
            for (j=i;j<n;j++){
                System.out.print("* ");
            }
            for (j=0;j<i;j++){
                System.out.print("    ");
            }
            /*for (j=0;j<i;j++){
                System.out.print("  ");
            }*/
            for (j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();

        }


        // 0->i increasing
        // i->n decreasing





    }
}
