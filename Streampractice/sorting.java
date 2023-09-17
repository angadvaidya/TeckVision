package Streampractice;

import java.util.ArrayList;
import java.util.List;

public class sorting {
    public static void main(String[] args) {
        List<String>name=new ArrayList<>();
        name.add("mangesh");
        name.add("namdev");
        name.add("satish");
        name.add("pradeep");
        name.add("tanu");
        name.add("mangesh");
        name.add("shaileash");
        //sorting the sequence of alphabetic charectore or natural order
        name.stream().sorted().forEach(System.out::println);
    }
}
