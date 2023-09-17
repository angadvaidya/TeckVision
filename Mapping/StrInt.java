package Mapping;

import java.util.HashMap;
import java.util.Map;

public class StrInt {
    public static void main(String[] args) {
        Map<String,Integer>hm=new HashMap<String, Integer>();
        hm.put("a",100);
        hm.put("b",200);
        hm.put("c",300);
        hm.put("d",400);
        System.out.println(hm);//if you want to the row
        // for using for each loop
        for(Map.Entry<String,Integer>me:hm.entrySet()) //if you want to the column
        {
          //  System.out.println(me+";");
            System.out.println(me.getKey()+":"+me.getValue()+";");
          //  System.out.println(me.getValue());

        }

    }
}
