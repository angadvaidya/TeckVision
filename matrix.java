package Array;/*
package Array;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        int row=0;
        int column=0;
        int a[][]=null;
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        column=sc.nextInt();

        a=new int[row][column];

        System.out.println("Enter row and column");
        for(int i=0;i<= a.length;i++){
            for(int j=0;j<a[0].length;j++){

            }
        }
        int rowsum;
        int columnsum;
        for(int i=0;i<3;i++){
            rowsum=0;
            columnsum=0;
            for(int j=0;j<3;i++){
                rowsum+=a[i][j];
                columnsum+=a[j][i];

            }
            System.out.println("Row-"+(i+1)+"sum="+rowsum);
            System.out.println("Column-"+(i+1)+"sum="+columnsum);
        }
        sc.close();

    }
}
*/
import java.util.Scanner;

public class matrix {

    // main method
    public static void main(String[] args) {

        // declare variables
        int row = 0;
        int column = 0;
        int a[][] = null; // matrix

        // create Scanner class object to read input
        Scanner scan = new Scanner(System.in);

        // ask row and column size
        System.out.println("Enter row and column size: ");
        row = scan.nextInt();
        column = scan.nextInt();

        // initialize matrices
        a = new int[row][column];

        // read matrix A
        System.out.println("Enter Matrix: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        // variables
        int rowsum;
        int columnsum;

        // find row sum and column sum
        for (int i = 0; i < 3; i++) {

            rowsum = 0;
            columnsum = 0;

            for (int j = 0; j < 3; j++) {
                rowsum += a[i][j];
                columnsum += a[j][i];
            }

            System.out.println("Row-" + (i + 1) + " sum = " + rowsum);
            System.out.println("Column-" + (i + 1) +
                    " sum = " + columnsum);
        }

        // close Scanner
        scan.close();
    }

}

