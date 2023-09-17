package anonymous;


interface polygon{
    public void display();
        }

public class Anonymousclass {
    public void vijay(){
        //Anonymous class implenting iterface
        polygon ap=new polygon() {
            @Override
            public void display() {
                System.out.println("anonymous class impliment of class");
            }
        };
         ap.display();

    }
}
 class shubham{
public static void main(String[]args){
        Anonymousclass av=new Anonymousclass();
        av.vijay();
        }
        }
