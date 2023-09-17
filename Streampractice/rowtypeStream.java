package Streampractice;

import java.util.ArrayList;
import java.util.List;

public class rowtypeStream {
    public static void main(String[] args) {
        List<String>listOfStrings=new ArrayList<>();
        listOfStrings.add("one");
        listOfStrings.add("two");
        listOfStrings.add("three");
        listOfStrings.stream().forEach(System.out::println);
    }
}
