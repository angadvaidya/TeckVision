package java8f;
// Java program to demonstrate functional

/*
public class functional_interface {
    public static void main(String[] args) {
        // create anonymous inner class object

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("it is functional interface has contain only one abstract method is know as functional interface ");

            }

        }).start();
    }
}
*/

 interface functional_interface {
     void show(String mas);

     default int doSum(int a, int b) {
         return a+b;
     }

     class dimond implements functional_interface {
         @Override
         public void show(String mas) {
             System.out.println(mas);

         }
     }

     public static void main(String[] args) {
         dimond object = new dimond();
         object.show("hello sir");
         System.out.println(object.doSum(2,4));

     }
 }



