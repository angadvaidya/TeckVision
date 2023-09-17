package constractore;

public class constructoreprivate {
    private constructoreprivate(int id,String name){
      super();
        System.out.println("yes id ands name is"+id+" "+name);
    }
    constructoreprivate(long roll) {
        this (5,"satish");
        System.out.println("yes my roll number" + roll);
    }
    }
    class soham extends constructoreprivate{
        soham(String collage){
            super(55);
            System.out.println("my collage name"+collage);
        }
        void soham1(){
        }


        public static void main(String[] args) {
            soham n=new soham("wagholi");
        }


    }

