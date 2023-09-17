package arithmetic;
//4. Write a program to check whether a number is divisible by 5 and 11 or not

public class assingnment4 {
    public static void main(String[] args) {
        int number = 50;
        if(number %5==0 && number %11==0){
            System.out.println("it is divisible by 5 and 11");
        }
        else{
            System.out.println("it is not divisible by 5 and 11");
        }
    }
}
