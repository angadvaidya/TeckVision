package Streampractice;

import java.util.ArrayList;
import java.util.List;

public class mapping {
    public static void main(String[] args) {
        List<String>n=new ArrayList<>();
        n.add("vijay");
        n.add("ram");
        n.add("vijay");
        n.add("shubham");
        n.add("akash");
        n.add("saurab");
        n.add("nichay");
        n.add("anuradh");
        //returns length of each name
       // n.stream().map(String::length).forEach(System.out::println);
        n.stream().mapToLong(String::length).forEach(System.out::println);
    }
}
