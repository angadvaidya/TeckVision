package interface1;

public interface lambda2 {
    void test(int a,int b);
}
class lam implements lambda2{

    @Override
    public void test(int a,int b) {
        int c=a+b;
        System.out.println("there is big interger value   "+c);
    }

    public static void main(String[] args) {
        lam sc=new lam();
        sc.test(8,25);

        //anonymous
        lambda2 st=new lambda2() {
            @Override
            public void test(int a, int b) {
                int c=a+b;
                System.out.println("anonymous is the different interface  "+c);

            }

                };
        st.test(58,75);
        lambda2 s=(int a,int b)->{
            int c=a+b;
            System.out.println("lambda is no use of method   "+c);
        };
        s.test(45,89);
    }
    }


