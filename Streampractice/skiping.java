package Streampractice;

import java.util.ArrayList;
import java.util.List;

public class skiping {
    public static void main(String[] args) {
        List<String> m = new ArrayList<>();
        m.add("ram");
        m.add("vijay");
        m.add("shubham");
        m.add("akash");
        m.add("saurab");
        m.add("nichay");
        m.add("anuradh");

        m.stream().skip(4).forEach(System.out::println);
    }
}
