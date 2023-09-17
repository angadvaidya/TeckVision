package Thread;

// Main Class
// Implememnting the Runnable interface
class threads implements Runnable{

    // Method 1
    // @Override
    public void run(){Lock();}
    // Method 2
    // Method is static
    public static synchronized void Lock() {
        // Getting the name of current thread by using
        // getName() method to get name of the thread and
        // currentThread() to get the current thread

        System.out.println(Thread.currentThread().getName());
        // class level lock
        synchronized (threads.class) {
            System.out.println("in block" + Thread.currentThread().getName());
            System.out.println("in block" + Thread.currentThread().getName() + "close");
        }
    }

     public static void main(String args[]){
         // Creating an object of above class
         // in the main() method
        threads s=new threads();
         // Sharing the same object across two Threads

         // Creating an object of thread class where
         // t1 takes g1
        Thread t=new Thread(s);
         // Creating an object of thread class where
         // t2 takes t1
        Thread t1=new Thread(s);
        threads s1=new threads();
         // Creating second object of above class
         // in the main() method
        Thread t2=new Thread(s1);
        Thread t3=new Thread(s1);
        //set name()method  is used to set name
         //thread
        t.setName("  movie");
        t1.setName("  start");
        t2.setName("  vedio");
        t3.setName("  music");
        //start() methode is used for initialize the current
        t.start();
        t1.start();
        t2.start();
        t3.start();


     }

     }


