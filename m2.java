/*
 class m2 implements Runnable{

        public void run() {
            synchronized (m2.class) {
                System.out.println("in block" + Thread.currentThread().getName());
                System.out.println("in block" + Thread.currentThread().getName());
            }
        }
        public static void main(String args[]){
            m2 s=new m2();
            Thread r=new Thread(s);
            Thread r1=new Thread(s);
            r.setName("vijay");
            r1.setName("saurab");
            r.start();
            r1.start();
        }
    }
*/

class m2 implements Runnable{

    @Override
    public void run() {
        synchronized (m2.this){
            System.out.println("in block "+Thread.currentThread().getName());
            System.out.println("in block"+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        m2 s=new m2();
        Thread a=new Thread(s);
        Thread b=new Thread(s);
        a.setName("sham");
        b.setName("krishna");
        a.start();
        b.start();
    }
}