package ExceptionHandling;

import java.util.Scanner;

public class multipalex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            try
            {
                int n = Integer.parseInt(sc.nextLine());

                if (99%n == 0)
                    System.out.println(n + " is a factor of 99");
                else{
                    System.out.println("there is condition fall");

                }
            }
            catch (ArithmeticException ex)
            {
                System.out.println("Arithmetic " + ex);
            }
            catch (NumberFormatException ex)
            {
                System.out.println("Number Format Exception " + ex);
            }
        }
    }



