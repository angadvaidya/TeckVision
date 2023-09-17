package Array;

/*
public class Desending {
    public static void main(String[] args) {
        Integer arr[] = {7, 8, 45, 62, 12, 36, 89, 5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,Collections.reverseOrder());
        for (int values : arr) {
            System.out.print(values +" ");
        }
    }
}
*/

import java.util.Arrays;
import java.util.Collections;

/*import java.util.Arrays;
import java.util.Collections;

class ArraySort {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 1, 8, 10};
        Arrays.sort(arr, Collections.reverseOrder());

        for (int values : arr) {
            System.out.print(values + ", ");
            // 10, 8, 5, 2, 1,
        }
    }
}*/
public class Desending{

    public static void main(String[] args) {
        Integer st[]={1,2,4,5,6,7,7,754,3,3,22,23435};
        Integer sum;
        Arrays.sort(st);
        System.out.println(Arrays.toString(st));
        Arrays.sort(st, Collections.reverseOrder());
        System.out.println(Arrays.toString(st));
        for(int i=0;i<st.length;i++){
            sum=+st[i];
            System.out.print(sum);
        }







    }
}
