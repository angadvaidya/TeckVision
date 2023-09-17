package collection;

public class Arraylist1 {
    Object arr[];
    int s;
    int capacity;

     Arraylist1() {
        capacity = 10;
        s = 0;
        arr = new Object[capacity];

    }

   void add(Object it) {
        arr[s++] = it;
    }

    Object get(int index) {
        return arr[index];
    }

    int size() {
        return s;
    }
}

    class vijay {
        public static void main(String[] args) {
            Arraylist1 sc = new Arraylist1();
            sc.add(1);
            sc.add("shubham mahesh");
            sc.add(24);

            for (int i = 0; i < sc.size(); i++) {
                System.out.println(sc.get(i));
            }
        }

    }



