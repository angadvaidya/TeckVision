package Streampractice;

import java.util.ArrayList;
import java.util.List;

public class sorted {
    int x,y;

    sorted(Integer x, Integer y) {
        this. x=x;
        this.y=y;
    }


    @Override
    public String toString() {
        return "sorted{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
class show {
    public static void main(String[] args) {
        List<sorted> list = new ArrayList<>();
        list.add(new sorted(10, 100));
        list.add(new sorted(5, 49));
        list.add(new sorted(1, 250));
        list.add(new sorted(2, 200));


/*        list.stream()
                .sorted((p1, p2)->(p1.x).compareTo(p2.x))
                .forEach(System.out::println);
}*/
    }
}
