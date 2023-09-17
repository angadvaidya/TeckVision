package Streampractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class toArray {
    public static void main(String[] args) {
        List<String>name=new ArrayList<>();
        name.add("mangesh");
        name.add("namdev");
        name.add("satish");
        name.add("pradeep");
        name.add("tanu");
        name.add("mangesh");
        name.add("shaileash");
        //sorting first 3 names in an array
        Object[] streamArray=name.stream().limit(6).toArray();
        System.out.println(Arrays.toString(streamArray));

    }
}
