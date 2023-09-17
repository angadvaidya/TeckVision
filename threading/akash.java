package threading;

public class akash implements Runnable {

    @Override
    public void run() {
        for(int i=1;i<5;i++){
            System.out.println("aksah is her but he is not going "+i+"thread "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        akash a=new akash();
        Thread t=new Thread(a);
        t.start();
        t.setName("vijay");

        Thread r=new Thread(a);
        r.start();
        r.setName("shubham");

        Thread n=new Thread(a);
        n.start();
        n.setName("hash");

    }
}
