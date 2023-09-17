package collection;

import java.util.ArrayList;
import java.util.List;

public class collection1 {
    public static void main(String[] args) {
        List<Integer> sr = new ArrayList<>();
        List<String> list = new ArrayList<>();
        sr.add(1);
        sr.add(2);
        sr.add(3);
        sr.add(4);
        sr.add(5);
        sr.add(6);
        sr.add(7);
        list.add("sourab");
        list.add("vijay");
        list.add("akshay");
        list.add("shubham");
        list.add("arthi");
        list.add("prity");
        list.add("phirty");
        for (String s : list)
        {
            System.out.println(s.concat("  java"));
        }
        for(Integer p:sr);
        System.out.println(sr);


    }
}
