package ExceptionHandling;

public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        //array int the value of number 2 but count the value start/first numbesr is 0
        //if the ArrayIndexOutOfBound get then you use the try block
        //   try {
        int a[] = new int[1];
        a[0] = 11;
        a[1] = 12;
        a[2] = 13;
        for (int i = 0; i <= a.length; i++) {
            System.out.println(a[i]);
        }
    }  }
/*            //if code is ArrayIndexOutOfBound get the after the use the catch block
           catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception massage"+e.getMessage());
                System.out.println("vijay is perfectly java developer");
            }
        }*/

   // }
//}
