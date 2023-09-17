
package arithmatic;
/*
//18. Write a program to calculate profit or loss

import java.util.Scanner;

public class profit18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int loss;
        System.out.println("take the loss");
        int sell;
        System.out.printf("take the profit");
       double purches;
        System.out.println("it is the purches");
        System.out.printf("");
        sell=sc.nextInt();
        purches=sc.nextInt();
        loss=sc.nextInt();
        if (loss<=purches&&purches<=sell){
            System.out.println("it is profit");
        }
        else {
            System.out.println("theye are loo");
        }
    }
}
*/

import java.util.Scanner;

public class profit18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("book is the selling price");
        double selling;
        double profitper;
        double lossper;
        System.out.println("book is the casting price");
        double cost;
        selling=sc.nextDouble();
        cost=sc.nextDouble();
    //    profitper=sc.nextDouble();
    //    lossper=sc.nextDouble();
        if (cost-selling>0){
            System.out.println("loss" +(cost-selling));
      //      profitper=(profitper/cost)*100;
        }
        else if (selling-cost>0){
            System.out.println("profit"+(selling-cost));
        //    lossper=(lossper/cost)*100;
        }
    }
}
