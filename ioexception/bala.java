package ioexception;

import java.util.Scanner;

public class bala {
    //take the main class
    public static void main(String[] args) {
        //one string variable
        String s="gopal sharma";
        //create scanner obj
        Scanner scanner=new Scanner(s);
        //use sout and nextline
        System.out.println(" "+scanner.nextLine());
        //uses the ioexception
        System.out.println(" "+scanner.ioException());
        //and file close
        scanner.close();
    }
}
