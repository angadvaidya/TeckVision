package Streampractice;

import java.util.ArrayList;
import java.util.List;

public class practic {
    public static void main(String[] args) {
        List<String>name=new ArrayList<>();
        name.add("vijay");
        name.add("saurab");
        name.add("shubham");
        name.add("aksha");
        name.add("vishal");
        name.add("abhi");
        name.add("om");
        name.add("om");


     //   name.stream().filter((String names)->names.length()<5).forEach(System.out::println);//filter is use no of above 5 char
       // name.stream().filter((String names)->names.length ()>5).forEach(System.out::println);
      // name.stream().distinct().forEach(System.out::println);//does not use int the duplicate character
       // name.stream().limit(4).forEach(System.out::println);//limit means each number each character
        name.stream().skip(3).forEach(System.out::println);//above 3 character is skiped



       // name.stream().map((String name1)->name1.length()>4).forEach(System.out::println);//ture and false


    }

}
