package Array;

import java.util.*;
public class assending {
    public static void main(String[] args) {
        int arr[] = {5, -2, 23, 7, 87, -42, 500};
        System.out.println("the original array is :");
        for (int num :arr) {
            System.out.println(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\n the sort array is:"+arr.toString());


    }
}
