package arithmatic;

import java.util.Scanner;
//16. Write a program to check whether the triangle is equilateral, isosceles or scalene triangle

public class equeiso {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double side1,side2,side3;
        side2=sc.nextInt();
        side1=sc.nextInt();
        side3=sc.nextInt();
        if( (side1==side2)&&(side3==side1)&&(side2==side3)){
            System.out.println("this is the equilateral");
        }
        else if((side1==side2)||(side2==side1)||(side3==side2))
        {
            System.out.println("this is the isosceles");
        }
        else{
            System.out.println("this is the scalene");
        }



    }
}
