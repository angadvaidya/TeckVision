package ioexception;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {                        // give Throw IOException
        File f = new File("C:\\Users\\h\\OneDrive\\Desktop\\lc.txt");
                                                                  //try {
        try {
            if (f.createNewFile()) {
                 System.out.println("if File successfully creat   ");
             } else {
                 System.out.println("file already exist   !");
             }
        } catch (IOException e) {
            System.out.println("Exception caught");
           // throw new RuntimeException(e);
        }
        //catch(IOException e){
        System.out.println("hello java");
                                                                         // throw new RuntimeException(e);
        }
    }




