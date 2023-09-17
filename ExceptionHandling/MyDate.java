package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/*
import static Finalimmutable.disply.show;
import static jdk.nashorn.internal.objects.NativeRegExp.test;
*/

public class MyDate {
/*    public static void main(String[] args)throws InvalidDayException {
        InvalideMonthException{
            MyDate MyDateref=new MyDate(20/05/1994);
            try{
                if (MyDateref.getMonth()<1||MyDateref.getMonth()>12)&&(MyDateref.getMonth()<1||MyDateref.getMonth()>31)
            }throw new InvalidDayMonthException();

        }
    }
}*/

/*
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("abc");//this exception is NumberFormatsException
        } catch(NumberFormatException ex){
            System.out.println("exception handling successfully in java") ;

        } catch(Exception e) {
            System.out.println("exception handling is successfully handle");
        }
    }//exception is already handle the above caught by above catch block
}*/

/*    public static void main(String[] args) {
        try {
            String s = "null";
            System.out.println(s.length());////This statement throws NullPointerException
        }
        catch(NullPointerException ex) {
            System.out.println("Null point exception is catch here");
            throw ex;     //Re-throwing NullPointerException
        }
    }*/


    public static void main(String[] args) {
        try{
            test();
        } catch(FileNotFoundException e){
            e.getStackTrace();
        } catch(IOException e){
            e.getStackTrace();
        } catch (SQLException es){
            es.getStackTrace();
        }
    }

    public static void test()throws FileNotFoundException,IOException,SQLException  {
        System.out.println("inside tests method");

    }
}

