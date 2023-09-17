package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class readerProgram {

    public static void main(String[] args) {

       // FileReader obj = new FileReader("show.txt");

        try {
            FileReader obj = new FileReader("show.txt");
        } catch (FileNotFoundException e) {
          //  throw new RuntimeException(e);
            e.getStackTrace();
        }
        System.out.println("exception handled ");
    }

}
