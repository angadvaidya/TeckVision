package Array;

public class Arrray1 {
    public static void main(String[] args) {
       int k,i,j;
        int [] array = new int[]{1,2,3,4,5,6,7};
        for ( i=0;i<array.length;i++){
            for( j=i+1;j<array.length;j++){
                if(array[i]<array[j]) {
                    k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }

            }
            System.out.println("descending ="+array[i]);

        }
        int n=array.length;
        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if(array[i]>array[j]){
                    k=array[i];
                    array[i]=array[j];
                    array[j]=k;
                }
            }
            System.out.println("ascending ="+array[i]);
        }















/*

        int [] array = new int []{1,2,2,3,3,4,1,4};
        int n= array.length;
        for (int i=0;i<n;i++){
            for (int j =i+1;j<n;j++){
                if (array[i]==array[j]){
                    System.out.println(array[i]);
                }

            }
        }

*/

    }
}
