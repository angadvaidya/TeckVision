package Streampractice;

import java.util.Arrays;
import java.util.OptionalInt;

public class min {
    public static void main(String[] args) {
     //   OptionalInt min = Arrays.stream(new int[]{7, 5, 2, 3, 7, 9}).min();
      //  System.out.println(min);

        OptionalInt max = Arrays.stream(new int[]{7, 5, 3, 2, 9, 4}).max();
        System.out.println(max);
    }

}
