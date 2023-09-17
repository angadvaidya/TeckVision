package Mapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countingCharactore {
    int CharCount;
    int intSum;
    public countingCharactore(int CharCount,int intSum){
        this.CharCount=CharCount;
        this.intSum=intSum;

    }
}
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String sv = sc.nextLine();
        String[] o = sv.split(" ");
        Map<String, countingCharactore> list = new HashMap<>();
        for (String d : o) {
            int CharCount = 0;
            int intSum = 0;
            for (char c : d.toCharArray()) {
                if (Character.isDigit(c)) {
                    CharCount++;


                } else if (Character.isDigit(c)) {
                    int num = Character.getNumericValue(c);
                    intSum = num;
                }

            }



        }
    }
}
