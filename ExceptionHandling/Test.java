package ExceptionHandling;

public class Test {
    public static void main(String[] args) {
            int[] list = new int[4];// her is index value start 0,1,2,3 that means 3 values
/*        list[0]=20;
        list[1]=10;
        list[2]=15;             //for example in the array index number
        list[3]=25;
        list[4]=30;*/
        try{
            System.out.println(list[4]);
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}

/*
    public static <exception> void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 10;
        try {
            int x = (a * b) / (a - b + c);
            System.out.println("result" + x);
        }
        catch(Exception e){
            e.getStackTrace();
        }
        System.out.println("result");

    }
}*/
