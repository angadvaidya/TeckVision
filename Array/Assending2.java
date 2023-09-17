package Array;

public interface Assending2 {
    public static void main(String[] args) {
        int arr[]={10,3,4,6,7,8,9,9,88,6};
        int k;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    k=arr[i];
                    arr[i]=arr[j];
                    arr[j]=k;

                }

            }
            System.out.println(arr[i]);

        }
    }

}
