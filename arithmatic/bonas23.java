package arithmatic;
//23. The current year and the year in which the employee joined the organization are entered through the keyboard.
// If the number of years for which the employee has served the organization is greater than 3 then a bonus of Rs. 2500/- is given to the employee.
// If the years of service are not greater than 3, then the program should do nothing

public class bonas23 {
    public static void main(String[] args) {
        int exprince = 2;
        int bonus = 2500;
        if (exprince >= 3) {
            System.out.println("if you have three year expriance then its your bonus\n" + bonus);
        }
        else{
            System.out.println("if your dont have any exprince then no bonu");
        }
    }
}
