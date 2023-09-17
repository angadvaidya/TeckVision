package oops;
import java.util.*;
/*
public class loops1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        for (int i = 1; i <= a; i++) {
            System.out.println("");
            for (int j =1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println("");
        }
    }
}
*/


public class loops1
{
    public static void rightTriangle(int n)
    {
        int i, j;
        for(i=0; i<n; i++) {
            System.out.print(" ");
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int n = 10;
        rightTriangle(n);
    }
}
