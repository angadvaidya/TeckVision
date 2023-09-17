package arithmatic;/*
26. A company insures its drivers in the following cases:

        If the driver is married
        If the driver is unmarried, male & above 30 years of age
        If the driver is unmarried, female & above 25 years of age*/
public class insures26 {
    public static void main(String[] args) {
        int male=39;
        int female=24;
        if (male>30){
            System.out.println("is it male married because above 30  ");
        }
        if (female>25){
            System.out.println("is it female married because above 25");
        }
        else if (male<30){
            System.out.println("is it male not married because less than 30 ");
        }
        else if (female<25){
            System.out.println("is it  female not married because less the 25");

        }
    }
}
