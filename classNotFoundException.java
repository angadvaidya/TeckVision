public class classNotFoundException extends Throwable {
    public static void main(String[] ars)  throws classNotFoundException{
        try {
            Class.forName("java");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("hello java");
    }
}
