package inheritance;

class jaisinga {
    void show() {
        int a = 10;
        int b = 25;
        int ans = a + b;
        System.out.println(ans + " i hav property ans");
    }

    void display() {
        float a = 25.25f;
        int b = 10;
        float c = (float) a + b;
        System.out.println(c);
    }

    void show1() {
        System.out.println("madhav");
    }
}

    class govind extends jaisinga {
        void prased() {
            int a = 10;
            int b = 25;
            int value = a + b;
            System.out.println("value"+value);
        }

        public static void main(String[] args) {
            govind obj = new govind();
            obj.prased();
            obj.show();
            obj.display();
            obj.show1();
        }
    }






