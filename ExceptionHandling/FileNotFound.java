package ExceptionHandling;

import java.io.FileInputStream;

public class FileNotFound {
    public static void main(String[] args) {
       // FileWriter s=new FileWriter("show.txt");

       try {
            FileInputStream s=new FileInputStream("show.txt");
        } catch (Exception e) {
            // throw new RuntimeException(e);
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("handled well");
    }
}

