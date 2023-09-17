package Mapping;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public int hashCode(){
        return 11;
    }
    public static void main(String[] args) {
        MapTest Key4=new MapTest();
        System.out.println("Hashcode value is "+Key4.hashCode());
        MapTest Key5=new MapTest();
        System.out.println("Hashmap value is "+Key5.hashCode());

        Map<MapTest,String> map11=new HashMap<>();
        map11.put(Key4,"value4");
        map11.put(Key5,"value5");
        System.out.println(map11.get(Key5));
        System.out.println(map11);
        System.out.println(map11.get(Key4));
        System.out.println(map11);


        Map<Integer,String>map=new HashMap<>();
        map.put(1,"test" );
        System.out.println("map size is "+map.get(1));
        map.put(10,"vLUE");
        System.out.println("map size is "+map.get(10));
        map.put(101,"sham");
        System.out.println(map.get(101));

    }
}
