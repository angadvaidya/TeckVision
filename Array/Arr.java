package Array;


public class Arr {
        public static void main(String [] args)
        {
            int arr[]={5,6,4,8,1,2,12,45};
            int k;
            for(int i=0;i<arr.length;i++)
            {
                for (int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]<arr[j]){
                        k = arr[i];
                        arr[i]=arr[j];
                        arr[j]=k;
                    }
                }
                System.out.println(arr[i]);
            }
        }

    }


/*
public class Arr {
    public static void main(String[] args) {
        System.out.print(new int[]{1, 2, 3}.length); // It will display 3.
    }
*/
/*        double[] arr = new double[]{3, 2, 4, 6, 7, 9, 43};
        {

            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }*/

/*
    }


        int i = 4;
        String[ ] arr = new String[i];
        arr[0] = "A";
        arr[1] = "B";
        arr[2] = "C";

        System.out.print(Arrays.toString());
    }
}*/
