package ExceptionHandling;


import java.io.IOException;
import java.sql.SQLException;


public class exceptionmultipalecatch{

        public static void main(String[] args) {
            try {
                foo();
            } catch (IOException  | SQLException e) {
            //    e = new Exception();
                e.printStackTrace();
            }catch(Exception e){
                e = new Exception("");
                e.printStackTrace();
            }
        }

        public static void foo() throws IOException, SQLException{
            throw new IOException("IOException");
        }

    }




/*public class exceptionmultipalecatch {
    void show() throws IOException {
        throw new IOException("tired i can't play");
    }
}
;

class pe extends exceptionmultipalecatch {
    void display() throws Exception {
        throw new Exception("let play");
    }

    public static void main(String[] args) throws IOException {
        exceptionmultipalecatch s=new pe();
        s.show();
    }
}*/
