package java8;

 class anonymouse {
     public void show(){
         System.out.println("hello");
     }
}
public class ano{
    public static void main(String[] args) {
        anonymouse se=new anonymouse() {
            public void show() {
                System.out.println("hi");
            }
        };

                anonymouse ses=new anonymouse(){
                    public void show() {
                        System.out.println("hello java");

                    }
                };
                se.show();
                ses.show();

            }
        }


