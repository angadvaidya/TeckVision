import java.io.*;

//public class FileReader {
//
//}

class IoException1 {
    void m1(){
        try {
            FileReader read =new FileReader("ow.txt");
            try {
                int i;
                while(( i=read.read())!=-1){
                    System.out.print((char)i);

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
            // throw new RuntimeException(e);
        }
        System.out.println("exception handled");


    }

    public static void main(String[] args) {
        IoException1 io=new IoException1();
        io.m1();
    }
}

