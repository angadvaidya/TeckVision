public class thtreads extends Thread{
    public void run(){
        for (int i=0;i<=5;i++){
            System.out.println("current threads"+i+"    threads name:"+Thread.currentThread().getName());
        }
    }
    public static  void main(String[] args) {
        thtreads d=new thtreads();
        d.setName("display2");
        d.start();



        thtreads d2=new thtreads();
        d2.setName("goway1");
        d2.start();



        }
    }

