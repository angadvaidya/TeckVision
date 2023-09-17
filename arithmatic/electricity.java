package arithmatic;
/*21. Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:

        For first 50 units Rs. 0.50/unit
        For next 150 units Rs. 0.75/unit
        For next 250 units Rs. 1.20/unit
        For unit above 250 Rs. 1.50/unit
        An additional surcharge of 20% is added to the bill*/

public class electricity {
    public static void main(String[] args) {
        int unit = 250;
        float amount = 300;
        float charges;
        float Bill_charges;
        if (unit <= 50) {
            amount = unit * 0.50f;
            System.out.println(+amount);
        } else if (unit <= 150) {
            amount = unit * 0.75f;
            System.out.println(+amount);
        } else if (unit <= 250)
            amount = unit * 1.20f;
        System.out.println(+amount);
        charges = amount * 0.2f;
        Bill_charges = amount + charges;
    }
}
