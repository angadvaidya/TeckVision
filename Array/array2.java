package Array;

import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        int arr[] = {11, 12, 31, 42, 5, 6, 7, 8, 5, 8, 9, 4};
        System.out.println("print the element");
        Arrays.sort(arr, 1, 5);
        {
            System.out.println("arr[]" + Arrays.toString(arr));
        }

        int ar[] = {77, 7878, 87, 45, 54, 5465, 65,};
        System.out.println("print the element");
        Arrays.sort(ar,4,6);
        System.out.println("ar[]"+ Arrays.stream(ar).max());
        System.out.println("arr[]"+ar.clone());
        System.out.println(Arrays.stream(ar).average());

    }
}

