package arithmatic;

import java.util.Scanner;

//21. Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:
//
//For first 50 units Rs. 0.50/unit
//For next 150 units Rs. 0.75/unit
//For next 250 units Rs. 1.20/unit
//For unit above 250 Rs. 1.50/unit
//An additional surcharge of 20% is added to the bill
/*
public class electricalbill {
    public static void main(String[] args) {
        int unit=300;
        float paybill;
        if(unit<=50){
            System.out.println(paybill=unit*0.5f);
        }
        else if(unit<=150){
            System.out.println(paybill=unit*0.75f);
        }
        else if(unit<=250){
            System.out.println(paybill=unit*1.20f);
        }
        else if(unit>=250){
            System.out.println(paybill=unit*1.50f);
        }
    }
}
*/
public class electricalbill{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int unit;
        unit=sc.nextInt();
        float paybill;
        paybill=sc.nextInt();
        if(unit<=50){
            System.out.println(paybill=unit*0.5f);
        }
        else if(unit<=150)
        {
            System.out.println(paybill=unit*0.75f);
        }
        else if(unit<=250){
            System.out.println(paybill=unit*0.150f);
        }
    }
}