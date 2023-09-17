package arithmatic;
//12. Write a program to input month number and print month Name

import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year;
        year=sc.nextInt();
        if (year==1){
            System.out.println("janivary");
        }
        else if(year==2){
            System.out.println("feburvary");
        }
        else if (year==3){
            System.out.println("march");
        }
        else if (year==4){
            System.out.println("april");
        }
    }
}
