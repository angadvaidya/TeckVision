package Streampractice;

import java.util.ArrayList;
import java.util.List;

public class distinct {
    public static void main(String[] args) {
        List<String>name=new ArrayList<>();
        name.add("mangesh");
        name.add("namdev");
        name.add("satish");
        name.add("pradeep");
        name.add("tanu");
        name.add("mangesh");
        name.add("shaileash");
        name.add("tanu");
        name.add("mangesh");
        //distinct is does not use in duplicate only uniqueness
       //  name.stream().distinct().map(String::length).forEach(System.out::println);
        name.stream().distinct().map(String::toUpperCase).forEachOrdered(System.out::println);
        name.stream().filter((String names)->names.length()>5).forEach(System.out::println);
        }

    }

