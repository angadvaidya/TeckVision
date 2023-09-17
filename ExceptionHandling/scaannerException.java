package ExceptionHandling;

import java.util.Scanner;

public class scaannerException {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
      // int n=Integer.parseInt(scr.nextLine());
        try {
            int n = Integer.parseInt(scr.nextLine());

            if (99 % n == 0) {
                System.out.println(n + "No of factorinal of  99");
            }
        }
            catch( NumberFormatException | ArithmeticException  ex){
                System.out.println("does not hava a factorial of 99" + ex);
            }}}




