package arithmatic;
//15. Write a program to input all sides of a triangle and check whether triangle is valid or not

public class sidebyside {
    public static void main(String[] args) {
        int side=30;
        int side1=60;
        int side2=90;
        int res=side+side1+side1;
        if (res==180){
            System.out.println("side by side triangle is valid");
        }
        else{
            System.out.println("triangle is not valid");

        }
    }
}
