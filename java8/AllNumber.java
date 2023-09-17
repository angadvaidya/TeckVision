package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllNumber {
/*    public static void main(String[] args) {
        String s = "we23 4a2re jav7a deve3loper";
        String[] s1 = s.split(" ");
        for (int i = 0; i <= s1.length; i++) {
            for (int j = s1[i].length() - 1; j >= 0; j--) {
                // System.out.println(s1[i].charAt[j]);
                System.out.print(s1[i].charAt(j));
            }
        }

    }
}
    private*/
private Integer key;
    private String value;
    public AllNumber(Integer id,String name) {
        this.key = id;
        this.value = name;
    }

    public Integer getKey() {
        return key;
    }
    public String getValue(){
        return value;

}


    public static void main(String[] args) {

        List<AllNumber> list=new ArrayList<>();
        list.add(new AllNumber(1,"this"));
        list.add(new AllNumber(2,"is"));
        list.add(new AllNumber(3,"java"));


        Map<Integer,String> map= new HashMap<>();
        list.forEach((n)-> {map.put(n.getKey(),(n.getValue()));});
        System.out.println("map:"+map);

    }
}
