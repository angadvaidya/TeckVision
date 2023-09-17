package Streampractice;

import java.util.ArrayList;
import java.util.List;

public class filter {
    public static void main(String[] args) {
        List<String>names=new ArrayList<>();
        names.add("namdev");
        names.add("akasha");
        names.add("satish");
        names.add("pradeep");
        names.add("tanu");
        names.add("om");
        names.add("mangesh");
        names.add("shaileash");
        String ok="s";
        //select names containing more than 5 charecter
      //  names.stream().filter((String name)->name.length()==4).forEach(System.out::println);
        names.stream().filter((String name)->name.length()<=4).forEach(System.out::println);
        // names.stream().filter((String name)->name!=ok).forEach(System.out::println);
     //  names.stream().filter(ref->ref!=ok).forEach(System.out::println);

        //if you want to the less than <5 so this only sing change


    }
}
