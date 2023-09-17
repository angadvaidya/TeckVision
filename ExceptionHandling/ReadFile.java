package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadFile {
    //throws use in the only cheak exception and with the methode name does not use in uncheakes exception
        void readfile() throws FileNotFoundException {
            FileInputStream fis=new FileInputStream("d:/abc.txt");
            //statment
        }
        void savefile() throws FileNotFoundException {
            String text="this is demo";
            FileOutputStream fos=new FileOutputStream("d/xyz.text");
            //use in the statment
        }
}
//we are use in the second class becouse the up to file read in the second class
class Om{
    public static void main(String[] args) {
        ReadFile rs = new ReadFile();//we are use in the try catch block
        try {
                rs.readfile();              //throw keyword does not handle exception only throws to other
            //if we are print and handle exception then use in try catch block the main methode
            }
            catch (FileNotFoundException e) {
                e.getStackTrace();
            }
            System.out.println("successfully the program");
        }
        }
//if we are the second method does not file exception become the create the file


