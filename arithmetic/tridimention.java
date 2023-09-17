package arithmetic;

public class tridimention {
    public static void main(String[] args) {
        int a=25;
        int b=32;
        int c=4;

        if(a>=b&&a>=c){
            System.out.println("a is maximum value");
        }
        else if(b>=a&&b>=c){
            System.out.println("b is maximum vlaue");
        }
        else if (c>=a&&c>=b){
            System.out.println("c is greater than");
        }
        else
        {
            System.out.println("all of lesser");
        }

    }
}
