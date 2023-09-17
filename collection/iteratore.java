package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class iteratore {
    public static void main(String[] args) {
        List<String> n = new ArrayList<>();
        n.add("yogesh");
        n.add("10");
        n.add("50");
        n.add("80");
        n.add("sham");
        // n.remove("80");
        //System.out.println(n);
        for (int i = 0; i < n.size(); i++) {
            System.out.println("it ok  "+n.get(i));
        }
            Iterator s = n.iterator();
            while (s.hasNext()) {
                System.out.println(s.next());
            }
            ListIterator m = n.listIterator();
            while (m.hasNext()) {
                System.out.println(m.next());
            }
            while (m.hasPrevious()) {
                System.out.println(m.previous());
            }


        }
    }
