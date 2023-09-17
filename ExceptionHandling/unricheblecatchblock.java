package ExceptionHandling;



public class unricheblecatchblock {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("abc");   //this exception throws NumberFormatException
        } catch (Exception e) {
            System.out.println("this is exception of the program");
        }
    }
}

class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
        } catch (NumberFormatException ex) {
            System.out.println("hello print");
            //Compile time error
            //This block becomes unreachable as
            //exception is already caught by above catch block
        } catch (Exception ex) {
            System.out.println("This block handles all exception types");
        }

    }
}


class Host {
    public static void main(String[] args) {
        try {
            NumberFormatException ex = new NumberFormatException();    //Creating an object to NumberFormatException explicitly

            throw ex;        //throwing NumberFormatException object explicitly using throw keyword
        } catch (NumberFormatException ex) {
            System.out.println("explicitly thrown NumberFormatException object will be caught here");
        }

    }
}





