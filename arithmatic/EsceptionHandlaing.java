package arithmatic;

public class EsceptionHandlaing {
    public static void main(String[] args) {

            int a = 10;
            int b = 12;

            try {
                int sum = a/b;
                System.out.println(sum);
            }
            catch (Exception e){
                System.out.println(e);
            }

            finally {
                System.out.println("This is finally blocked code");
            }
        System.out.println("Exception Handled");




    }

}
