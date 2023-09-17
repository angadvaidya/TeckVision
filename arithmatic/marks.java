package arithmatic;
//19. Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
//Percentage >= 90% : Grade A
//        Percentage >= 80% : Grade B
//        Percentage >= 70% : Grade C
//        Percentage >= 60% : Grade D
//        Percentage >= 40% : Grade E
//        Percentage < 40% : Grade F
public class marks {
    public static void main(String[] args) {
      int physics = 78;
      int Chemistry = 44;
       int Mathematics = 65;
       int Computer = 78;
       int Biology=44;
      // int total=500;
        int obtain= physics+Chemistry+Biology+Mathematics+Computer ;
      int precentage=obtain/5;
     // int obtain= physics+Chemistry+Biology+Mathematics+Computer ;
    //  int percentage;
        if (precentage >=90 ) {
            System.out.println("gread A"+precentage);
     //      percentage=total/5;
        }
        else if (precentage>=80){
            System.out.println("gread first class"+precentage);

     //       percentage=total/5;

        }
        else if (precentage>=70){
            System.out.println("gread B"+precentage);
    //        percentage=total/5;
        }
        else if(precentage>=60){
            System.out.printf("gread C"+precentage);
    //        percentage=total/5;
        }
        else if(precentage>=40){
            System.out.println("pass"+precentage);
        }
        else{
            System.out.println("fails"+precentage);
        }

    }
}
