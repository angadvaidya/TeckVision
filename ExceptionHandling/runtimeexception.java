package ExceptionHandling;

public class runtimeexception {

    public static void main(String[] args) {
        try {
            String n = "vijay";

            System.out.println(n.charAt(1));
            System.out.println(n.charAt(30));

        } catch (Exception e) {
            e.getStackTrace();
        }
        System.out.println("your program is successfully handle");

        }
    }

