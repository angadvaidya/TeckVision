package constractore;

public class cons {
    cons(int id) {
        System.out.println("customer id " + id);
    }

    cons(String name, String address) {
        System.out.println("customer name and address");
    }
}
    class con extends cons{
   void con(){
            System.out.println("customer mobile number");
           }
        con(int a,int b) {
            super(5);

            System.out.println("ther is not mention");
        }
        public void main(String[] args){
            con n=new con(18,8);
            n.con();

    }
}
