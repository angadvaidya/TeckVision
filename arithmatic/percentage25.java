package arithmatic;

/*
25. The marks obtained by a student in 5 different subjects are input through the keyboard.
 The student gets a division as per the following rules:
  Write a program to calculate the division obtained by the student

        Percentage above or equal to 60 - First division
        Percentage between 50 and 59 - Second division
        Percentage between 40 and 49 - Third division
        Percentage less than 40 – Fail
*/

import java.util.Scanner;

public class percentage25 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
     //  double marks=sc.nextDouble();
       double math=sc.nextDouble();
       double sco=sc.nextDouble();
       double phy=sc.nextDouble();
       double ch=sc.nextDouble();
       double bio=sc.nextDouble();
       double total =math+sco+phy+ch+bio;
      // double percentage=sc.nextDouble();
         double percentage=(total/5);
       if (percentage>60) {
           System.out.println("first division");
       }
           else if (percentage<59&&percentage>=50){
               System.out.println("second division");
           }
           else if (percentage<49&&percentage>=40) {
           System.out.println("third division");
       }else{
           System.out.println("fails");
       }

    }
}
