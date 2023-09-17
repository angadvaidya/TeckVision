package arithmatic;
//8. Write a program to input any alphabet and check whether it is vowel or consonant

import java.util.Scanner;

public class vowelconsonant {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter char");
//        char ch=sc.next().charAt(0);
       char ch ='f';
        if (ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("it is alphabet of vowel");
        }
        else {
            System.out.println("it is not vowel and consonant");
        }

    }

}
