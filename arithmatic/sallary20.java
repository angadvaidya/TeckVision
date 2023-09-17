package arithmatic;

import java.util.Scanner;

/*20. Write a program to input basic salary of an employee and calculate its Gross salary according to following:

        Basic Salary <= 10000 : HRA = 20%, DA = 80%
        Basic Salary <= 20000 : HRA = 25%, DA = 90%
        Basic Salary > 20000 : HRA = 30%, DA = 95%*/
public class sallary20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float salary=sc.nextFloat();
        float Hra=sc.nextFloat();
        float Da=sc.nextFloat();
        if(salary<=10000){
            Hra=salary*0.20f;
            Da=salary*0.8f;
            System.out.println("salry and hra and da"+salary+" "+Hra+" "+Da);
        }
        else if (salary<=20000){
            Hra=salary*0.25f;
            Da=salary*0.90f;
            System.out.println("salary up to 20000 and hra and da"+salary+""+Hra+""+Da);
        }
        else if (salary<=30000){
            Hra=salary*0.3f;
            Da=salary*0.9f;
            System.out.println("salary up to 30000 and hra and da"+salary+""+Hra+" "+Da);

        }

    }
}
