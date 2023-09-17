package FirstJava;
import java.util.*;
 class Av{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int arr[]=new int[10];//static array
        System.out.println("enter 10 element");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=arr.length;i++){
            System.out.println("value of "+arr[i]+"");

        }
    }
}
