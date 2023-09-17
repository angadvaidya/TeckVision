package arithmatic;
/*
24. If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and DA = 90% of basic salary.
        If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of basic salary.
        If the employee's salary is input through the keyboard write a program to find his gross salary

*/

import java.util.Scanner;

public class employ24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //  double Hra=sc.nextDouble();
      //  double Da=sc.nextDouble();
        double Salary= sc.nextDouble();

        if (Salary<1500){
          double  Hra=Salary*0.1;
           double Da=Salary*0.9;
            System.out.println("less than in 1500    "+Hra+Da);
        }
        else if(Salary>=1500){
           double Hra=Salary+500;
            double Da=Salary*0.98;
            System.out.println("salary is greater than and equal to then  "+(Hra+Da));//14360


        }

    }
}
