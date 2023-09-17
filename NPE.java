import java.util.Locale;

public class NPE {

    public static void main(String[] args) {
        //  String is null point
        String n = null;//if you put the String name is n="vaidya"then do not get the null point exception
        //null point exception is  no use uppper case and lover case
        //we are not use in upper case and lower case
        try {
            System.out.println(n.toUpperCase());//if you want to this line give  exception then this line put the try blockssssssssssssss
        } catch (NullPointerException m) {
            System.out.println("handle is null point excetion");
        }
    }
}