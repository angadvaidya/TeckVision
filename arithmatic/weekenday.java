package arithmatic;

import java.util.Scanner;

public class weekenday {
    public static void main(String[] args) {
        int week;
        Scanner sc = new Scanner(System.in);
        System.out.println("all day but differet");
        week = sc.nextInt();
     //   week1 = sc.nextInt();
        if (week == 1) {
            System.out.println("sunday");
            System.out.println("assingment is ready");
        } else if (week == 2) {
            System.out.println("monday");
            System.out.println("go to class");
        } else if (week == 3) {
            System.out.println("tusday");
            System.out.println("program is ready");
        }
        else{
            System.out.println("error : please put the value 1 to 3");
        }

    }
}






