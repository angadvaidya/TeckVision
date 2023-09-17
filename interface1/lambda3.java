package interface1;

public interface lambda3 {
    String disp(String b,int a);
}
class shobhu implements lambda3{

    @Override
    public String disp(String b,int a) {

        System.out.println("it is use the student name  "+b +" "+a);
        return null;
    }

    public static void main(String[] args) {
        shobhu sc=new shobhu();
        sc.disp("vijay",5);

        //Anonymous
        lambda3 st=new lambda3() {
            @Override
            public String disp(String b, int a) {
                System.out.println("it is use int the interface of the program   "+b+"  "+a);
                return null;
            }
        };
        st.disp("shubham",6);

        //lambda
        lambda3 s=(String b,int a)->{
            System.out.println("lamba is use in the interface   "+b+" "+a);
            return b;
        };
        s.disp("saurab",7);

    }
}
