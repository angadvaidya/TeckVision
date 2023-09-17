package arithmatic;

import javax.swing.*;
import java.util.Scanner;

public class possweord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ATM Card:");
        int pass = 5665;
        int amm;
//        a = sc.nextInt();
        pass = sc.nextInt();
//        amm = sc.nextInt();
        if (pass == 5665) {
            System.out.println("Correct Password");}
        else if (pass==5665) {


            System.out.println("1. Deposite");
            System.out.println("2. Withdrow");
            System.out.println("3. check the balance");
        }
        if (pass == 1) {
            System.out.println("Enter the diposite the amount");
            int amt2 = sc.nextInt();
            System.out.println("Your amount is succesfully" + amt2);
        } else {
            System.out.println("Password incorrect");
        }
    }
}
//         if (pass ){









