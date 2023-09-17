package Streampractice;

import java.util.Arrays;
import java.util.OptionalInt;

public class terminaloperation {
    public static void main(String[] args) {
    //    int sum = Arrays.stream(new int[]{5, 5, 5, 6, 21, 156, 64, 4564}).reduce(0, (a, b) -> a + b);
    //    System.out.println(sum);
/*
        int sum = Arrays.stream(new int[]{4,5,6,2,6,8,6}).reduce(0,(a,b)->a+b);
        System.out.println(sum);
*/
/*
        OptionalInt s= Arrays.stream(new int[]{1,2,3,5,8,9,5,7}).reduce((a,b)->a+b);
        System.out.println(s);
*/
        /*OptionalInt s= Arrays.stream(new int[]{1,5,3,5,8}).reduce((a,b)->a+b);
        System.out.println(s);
        OptionalInt w= Arrays.stream(new int[]{4,6,5,4}).reduce((a,b)->a+b);
        System.out.println(w);
        OptionalInt n=Arrays.stream(new int[]{4,5,6,7,8,9,4}).reduce((a,b)->a+b);
        System.out.println(n);
        OptionalInt d= Arrays.stream(new int[]{4,5,6,9,8,7,2,2,}).reduce((a,b)->a+b);
        System.out.println(d);
        */
/*
        int sub=Arrays.stream(new int[]{1,8,3,5,4,6,}).reduce(0,(a,b)->a-b);
        System.out.println(sub);
        int m=Arrays.stream(new int[]{4,5,6,8,7,5,8,5,5,8}).reduce(0,(a,b)->(a+b));
        System.out.println(m);
*/
        OptionalInt min= Arrays.stream(new int[]{1,5,8,6,4,5,5,4,5,}).min();
        System.out.println(min);
        OptionalInt max=Arrays.stream(new int[]{1,2,6,4,8,4,8,4,6}).max();
        System.out.println(max);
        OptionalInt m=Arrays.stream(new int[]{1,5,6,7,89,7,9,4,5,45,55,88}).max();
        System.out.println(m);

    }
}
