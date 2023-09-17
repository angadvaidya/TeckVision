package ioexception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class classWriting {
    public static void main(String[] args) {
        try{
            FileWriter f=new FileWriter("C:\\Users\\h\\OneDrive\\Desktop\\lc.txt");
           try{
                f.write("java programing is the best language    !");

            }
            finally {
                f.close();
            }
            System.out.println("succesfully Data wrote in file");
        }
        catch(IOException i){
            System.out.println(i);
        }
    }
}
