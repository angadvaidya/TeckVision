package Streampractice;

import java.util.ArrayList;
import java.util.List;

public class Peek {
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
       // List<String> name=new ArrayList<>();
        name.add("mangesh");
        name.add("namdev");
        name.add("satish");
        name.add("pradeep");
        name.add("tanu");
        name.add("mangesh");
        name.add("shaileash");
        name.stream()
                //.filter(names->names.length()>5)
                // .peek(e->System.out.println("Filtered Name :"+e))
               // .map(String::toUpperCase)
               // .peek(e->System.out.println("Mapped Name :"+e))
               //.toArray();
               .forEach(System.out::println);

    }
}
