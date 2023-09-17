package Streampractice;

import java.util.ArrayList;
import java.util.List;

public class nominalStream {
    public static void main(String[] args) {
        List<String>names=new ArrayList<>();
        names.add("vijay");
        names.add("sham");
        names.add("om");
        names.add("mangesh");
        names.add("prashant");
        names.add("shadhu");
        names.add("archena");
        names.add("asha");
       names.stream().filter((String name)->name.length()>4).skip(2).forEach(System.out::println);
      // names.stream().filter((String name)->name.length()>5).skip(2).forEach(System.out::println);
      // names.parallelStream().filter((String name)->name.length()> 5).skip(3).forEach(System.out::println);

    }
}
