package Streampractice;

import java.util.ArrayList;
import java.util.List;

public class count {
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        name.add("mangesh");
        name.add("namdev");
        name.add("satish");
        name.add("pradeep");
        name.add("tanu");
        name.add("mangesh");
        name.add("shaileash");
        long noOfBigNames=name.stream().filter((String names)->names.length()>5).count();
        System.out.println(noOfBigNames);

    }
    }

