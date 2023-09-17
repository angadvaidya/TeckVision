class m1thread implements Runnable {
    @Override
    public void run() {

    synchronized (m1thread.class) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("in block" + Thread.currentThread().getName());
        System.out.println("in block" + Thread.currentThread().getName() + "close");
    }
    }
    public static void main(String args[]){
        m1thread s=new m1thread();
        Thread t1=new Thread(s);
        Thread t2=new Thread(s);
        Thread t3=new Thread(s);
        m1thread s1=new m1thread();
        Thread r1=new Thread(s1);
        Thread r2=new Thread(s1);
        Thread r3=new Thread(s1);
        t1.setName("   vijay");
        t2.setName("   saurab");
        t3.setName("   shubham");
        r1.setName("   shradda");
        r2.setName("   kanchan");
        r3.setName("   arti");
        t1.start();
        t2.start();
        t3.start();
        r1.start();
        r2.start();
        r3.start();

    }
}
