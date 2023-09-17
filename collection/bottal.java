package collection;

public class bottal {
    Object arr[];

    int s;
    int Capacity;

     bottal() {
        arr = new Object[Capacity];
        s = 0;
        Capacity = 10;
    }
    void add(Object till) {
        arr[s++]=till;
    }

    Object get(int index) {
        return  arr[index];
    }

    int size() {
        return s;
    }
}
class water{
    public static void main(String[] args) {
        bottal b=new bottal();
        b.add(1);
        b.add("bislary");
        b.add(20);
        for(int i = 0; i< b.size(); i++){
            System.out.println(b.get(i));
        }
        
    }
}
