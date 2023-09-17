package ioexception;

import java.util.Scanner;

public class kgf {
    public static void main(String[] args) {
        try {
            //get the string
            String m = "tdit classes in drawbridge";
            //create a new scanner
            //with the specified string object
            Scanner scanner = new Scanner(m);
            //print the nextLine of the string
            System.out.println("Scanner :" + scanner.nextLine());
            //close the scanner
            scanner.close();
            System.out.println("\nScanner closed.\n");
            System.out.println("trying to use scanner" + "after closing");
            //print the next line of the string
            System.out.println(scanner.hasNextLine());
        } catch (Exception e) {
            System.out.println("Exception thrown:\n" + e);

        }
    }
}
