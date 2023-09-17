package arithmatic;

import java.util.Scanner;
//13. Write a program to count total number of notes in given amount

public class not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ammount;
        ammount=sc.nextInt();
        while(ammount>0)
        {
            if (ammount>=2000){
                System.out.println("no.of notes 2000:"+(ammount/2000));
                ammount=ammount%2000;
            }
            else if(ammount>=1000){
                System.out.println("no.of notes 1000:"+(ammount/1000));
                ammount=ammount%1000;
            }
            else if (ammount>=500){
                System.out.println("no.of notes 500:"+(ammount/500));
                ammount=ammount%500;
            }
            else if (ammount>=200){
                System.out.println("no.of notes 200:"+(ammount/200));
                ammount=ammount%200;
            }
            else if (ammount>=100){
                System.out.println("no.of notes 100:"+(ammount/100));
                ammount=ammount%100;
            }
            else if(ammount>=50){
                System.out.println("no.of notes 50:"+(ammount/50));
                ammount=ammount%50;
            }
            else if (ammount>=20){
                System.out.println("no.of notes 20:"+(ammount/20));
                ammount=ammount%20;
            }
            else if(ammount>=10){
                System.out.println("no.of notes 10:"+(ammount/10));
                ammount=ammount%10;
            }
            else if (ammount>=5){
                System.out.println("no.of notes 5:"+(ammount/5));
                ammount=ammount%5;
            }
            else if (ammount>=2) {
                System.out.println("no.of notes 2:"+(ammount/2));
                ammount=ammount%2;
            } else if (ammount>=1) {
                System.out.println("no.of notes 1:"+(ammount/1));
                ammount=ammount%1;
            }
        }
    }
}
