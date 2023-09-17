package inheritance;

public class Parent {
    public void show() {
        System.out.println(" i am cumming");
    }
}

    class child extends Parent {
        void me() {
            System.out.println("i am go");
        }
    }
    class Accept {
        public static void main(String[] args) {
            child H = new child();
            H.show();
            H.me();
        }
    }



