package Static;
public class Test {
    static {
        System.out.println("the first is static keyword is print and execute");
    }
    int  show1() {
        int a = 10;
        int b = 20;
        int c= a + b;

        System.out.println("there is showing methode of int" + c);
        return 10;
    }

    public Test() {
        super();
    }
    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    double disp() {



       double id = 45;
       String a = "show";
       System.out.println("the enter the id and show" + id + " " + a);
       return 9;
   } }
   class diplay extends Test{
       @Override
       int show1() {
           return super.show1();
       }

       int show(){
            System.out.println("show the next the class display");
            return 5;
        }
       {
           System.out.println("show the next the class display of inter the void show method");
       }

       public static void main(String[] args) {
           diplay n=new diplay();
           n.show();
           n.disp();
           n.show1();
       }
   }





