package Static;

public class Display {
    static {
        System.out.println("first is exist static keyword after the get the main method");
    }

    void Display() {
        System.out.println("second the exist the :first is get the main class and go and see method/constrayucter");
    }
}
    class  disp extends Display {
        void show() {
            System.out.println("it is the second class means child class but exist the after the static and instance ");
        }

        {
            System.out.println("there is the third time of the ");
        }

        static void sho1() {
            System.out.println("where is came the static method");

        }


        public static void main(String[] args) {
            disp a = new disp();
            a.sho1();
            a.show();
            a.Display();


        }
    }

