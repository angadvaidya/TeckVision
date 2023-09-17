public class syncronise_thread extends Thread {
    public synchronized void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("count"+i+"thread"+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        syncronise_thread s=new syncronise_thread();


        Thread s1=new Thread(s);
        Thread s2=new Thread(s);
        s1.setName("java");
        s1.start();
        s2.setName("program");
        s2.start();


    }
}
