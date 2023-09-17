package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class employ implements Comparable<employ> {
    private int sr;
    private String name;
    private String last_name;
    private String Address;
    private static final String company = null;

    public employ(int sr, String name, String last_name, String address) {
        this.sr = sr;
        this.name = name;
        this.last_name = last_name;
        Address = address;
    }

    @Override
    public String toString() {
        return "employ{" +
                "sr=" + sr +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", Address='" + Address + '\'' +
                '}';

    }

/*    @Override
    public int compareTo(Object o) {
        return 0;
    }*/

    @Override
    public int compareTo(employ o) {
        return this.name.compareTo(o.name);
    }
}

class details{
    public static void main(String[] args) {
        List<employ> list = new ArrayList<employ>();
        list.add(new employ(1, "saurab", "patil", "lature"));
        list.add(new employ(2, "shubham", "birader", "lature"));
        list.add(new employ(3, "satish", "bhanushali", "kola pure"));
        list.add(new employ(4, "vijay", "kadpewar", "nanded"));
        list.add(new employ(5, "shubham", "sarode", "panjab"));
        list.add(new employ(6, "akash", "gange", "nager"));
        list.add(new employ(7, "akanksha", "gire", "pune"));
        list.add(new employ(8, "sham", "patil", "nanded"));
        Collections.sort(list);
        //  System.out.println(list);
      for(employ c:list) {

           System.out.println(c);
       }
        ListIterator<employ> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.hasPrevious()) {
                System.out.println("hello vijay"+iterator.previous());
            }
          //  iterator.add("java");
           // System.out.println("Using List Iterator "+iterator.next());


        }
    }
}
