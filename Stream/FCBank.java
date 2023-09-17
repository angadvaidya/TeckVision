package Stream;

import java.util.ArrayList;
import java.util.List;

public class FCBank {
    /*public static void main(String[] args) {
        List<String > companylist=new ArrayList<>();
        companylist.add("Google");
        companylist.add("Apple");
        companylist.add("Microsoft");
        Comparator<String>com
                =(String o1,String o2)->o1.compareTo(o2);
        Collections.sort(companylist,com);
        for(String name:companylist){
            System.out.println(name);
        }
    }*/

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("axc");
        list.add("cdc");
        list.add("abg");
        list.stream().sorted().forEach(System.out::println);
    }
}
