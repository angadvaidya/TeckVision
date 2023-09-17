package arithmatic;
//14. Write a program to input angles of a triangle and check whether triangle is valid or not

public class triangle {
    public static void main(String[] args) {
       int a=45;
       int b=75;
       int c=60;
       int res=a+b+c;
       if(res==180){
           System.out.println("triangle is valid ");
       }
       else{
           System.out.println("triangle is not valid");
       }
    }
}
