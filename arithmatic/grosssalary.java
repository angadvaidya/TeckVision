package arithmatic;
/*
20. Write a program to input basic salary of an employee and calculate its Gross salary according to following:

        Basic Salary <= 10000 : HRA = 20%, DA = 80%
        Basic Salary <= 20000 : HRA = 25%, DA = 90%
        Basic Salary > 20000 : HRA = 30%, DA = 95%
*/

import java.util.Scanner;

public class grosssalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     //     System.out.println("enter hra");
    //    System.out.println("enter the da");
    //    System.out.println("enter the basic salary");
       int basicsalary = sc.nextInt();
       float hra,da;
       hra=sc.nextInt();
       da=sc.nextInt();

        if (basicsalary <= 10000) {
            hra=basicsalary*0.2f;
            da=basicsalary*0.8f;
            System.out.println("gross salary =" +hra+ " "+da);
        }
        else if (basicsalary<=20000){
            hra=basicsalary*0.25f;
            da=basicsalary*0.90f;
            System.out.println("gross salary="+hra+" "+da);
        }
        else if (basicsalary<=30000){
            hra=basicsalary*0.3f;
            da=basicsalary*0.95f;
            System.out.println("gross salry:"+(basicsalary+hra+da));
        }

    }
}
