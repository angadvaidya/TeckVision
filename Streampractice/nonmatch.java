package Streampractice;

import java.util.ArrayList;
import java.util.List;

public class nonmatch {
        public static void main(String[] args) {
            List<String> name=new ArrayList<>();
            name.add("mangesh");
            name.add("namdev");
            name.add("satish");
            name.add("pradeep");
            name.add("tanu");
            name.add("mangesh");
            name.add("shaileash");
            if(name.stream().noneMatch((String names)->names.length()==4)){
                System.out.println("yes we are going");
            }
            else{
                System.out.println("condition is not satisfy");
            }
        }
    }



