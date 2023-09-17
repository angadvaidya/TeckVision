package Streampractice;

import java.util.Arrays;

public class reduce {
    public static void main(String[] args) {
      //  List<Integer>n=new ArrayList<>();
        int sum= Arrays.stream(new int[] {7,6,2,3,4,8}).reduce(0,(a,b)->a+b);
        System.out.println(sum);

        }
    }

