package interface1;

public interface lambda {
     void show();

}
class shaym implements lambda {

    @Override
    public void show() {
        System.out.println("hello java");

    }

    public static void main(String[] args) {
        shaym sc=new shaym();
        sc.show();

        //Anonymous inner class
        lambda re=new lambda() {
            @Override
            public void show() {
                System.out.println("vijay is good friends");
            }

        };
        re.show();
        //lambda
        lambda rs=()->{
            System.out.println("shubham is friends but is talent");
        };
        rs.show();
        }
    }

