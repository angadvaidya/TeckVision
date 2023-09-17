package Streampractice;

import java.util.ArrayList;
import java.util.List;

public class streamshow {
    public static void main(String[] args) {
        List <String>name=new ArrayList<>();
        name.add("shame");
        name.add("radheshame");
        name.add("shameradhe");
        name.add("krishnashame");
        name.add("krinshradheshame");
        name.add("source");

        long M=name.stream().filter((String names)-> names.length()>6).count();
        System.out.println(M);
         name.stream().sorted((String names1 ,String names2)-> names1.length()- names2.length()).forEach(System.out::println);
         name.stream().sorted().forEach(System.out::println);
         name.stream().skip(4).forEach(System.out::println);

    }
}
