package ExceptionHandling;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import static java.lang.Long.SIZE;

public class FileNotFoundException01 {
/*    public static void main(String[] args) {
        System.out.println("list[10]is"+list[10]);
    }
    catch(ArithmeticException ex){
        System.out.println("array intdex out of bound");
    }
    catch(ArrayIndexOutOfBound ex){
}
}*/
//public static void main(String[] args) {
public static void main(String[] args) {

}
    public void writeList() throws IOException {
        try (FileWriter f = new FileWriter("OutFile.txt");
             PrintWriter out = new PrintWriter(f)) {
            for (int i = 0; i < SIZE; i++) {
                HashMap<Object, Object> list = new HashMap<>();
                out.println("Value at: " + i + " = " + list.get(i));

            }
        }
    }

}


