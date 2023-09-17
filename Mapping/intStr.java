package Mapping;

import java.util.HashMap;
import java.util.Map;

public class intStr {
    public static void main(String[] args) {
        Map<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"satish");
        hm.put(2,"vijay");
        hm.put(3,"shubham");
        hm.put(4,"saurab");
        hm.put(5,"akash");
        hm.put(6," ");
        Map map=new HashMap();
        map.put(1,"akash");
        map.put(2,"mangesh");
/*
        System.out.println(hm.size());
        System.out.println(hm.keySet());
        System.out.println(hm.isEmpty());
        System.out.println(hm.entrySet());
        System.out.println(hm.get(2));
        System.out.println(hm.hashCode());
        System.out.println(hm.values());
        System.out.println(hm.containsKey(6));
        System.out.println(hm.getOrDefault(3,""));
        System.out.println(hm.containsValue("mangesh"));
*/
        for (Map.Entry Ram:hm.entrySet()) {
            System.out.println(Ram.getValue()+":"+Ram.hashCode());


        }
    }

        }









