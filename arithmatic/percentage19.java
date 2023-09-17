package arithmatic;
/*19. Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:

        Percentage >= 90% : Grade A
        Percentage >= 80% : Grade B
        Percentage >= 70% : Grade C
        Percentage >= 60% : Grade D
        Percentage >= 40% : Grade E
        Percentage < 40% : Grade F*/

import java.util.Scanner;

public class percentage19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int physics=sc.nextInt();
        int chemistry=sc.nextInt();
        int biology= sc.nextInt();
        int mathematics= sc.nextInt();
        int computer= sc.nextInt();
    //    int marks=sc.nextInt();
        //    int total_marks=physics+chemistry+biology+mathematics+computer;
        float percentage=sc.nextFloat();
        if(percentage>=90){
            System.out.println("Grade A");
        }
        else if (percentage>=80){
            System.out.println("Grade B");
        }
        else if(percentage>=70){
            System.out.println("Grade C");
        }
        else if (percentage>=60){
            System.out.println("Grade D");
        }
        else if (percentage>=50){
            System.out.println("Grade E");
        }
        else if (percentage>=40){
            System.out.println("Grade F");
        }
        else {
            System.out.println("fail");
        }

    }
}
