package Streampractice;

import java.util.ArrayList;
import java.util.List;

public class sortingcomparetor {
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        name.add("mangesh");
        name.add("namdev");
        name.add("satish");
        name.add("pradeep");
        name.add("tanu");
        name.add("mangesh");
        name.add("shaileash");
        //sorting comparator is use in the number of char

        name.stream().sorted((String names1,String names2)-> names1.length()-names2.length()).forEach(System.out::println);

    }
}
