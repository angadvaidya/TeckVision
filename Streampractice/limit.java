package Streampractice;

import java.util.ArrayList;
import java.util.List;

public class limit {
    public static void main(String[] args) {
        List<String> N=new ArrayList<>();
        N.add("divid");
        N.add("akshay");
        N.add("vijay");
        N.add("tushar");
        N.add("Nishaker");
       N.stream().limit(4).forEach(System.out::println);
      // N.stream().distinct().forEach(System.out::println);
    }
}
