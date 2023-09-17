//java program to illustrate the
//ioexception()method of scanner class in java
//without parameter


package IOException1;

import java.util.Scanner;

public class gfg {
    public static void main(String[] args) {                //if you want throws exceptioin
        String s="gfg geeks !";
        //create a new scanner
        //with specified String object
        Scanner scanner=new Scanner(s);
        //print the line
        System.out.println(""+scanner.nextLine());
        //check if there is an IO exception
        System.out.println(" "+scanner.ioException());
        //close the scanner
        scanner.close();
    }
}
