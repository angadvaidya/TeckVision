package setlistscollection;

import java.util.HashSet;
import java.util.Set;

public class setmethod {
    public static void main(String[] args) {
        Set H=new HashSet();
        H.add("mango");
        H.add("drakshay");
        H.add("peopeya");
        H.add("angire");
        H.add("pinaple");
        Set h=new HashSet();
        h.add("vijay");

        System.out.println(H);
        H.hashCode();//if you write the hashcode in this methode then same the methode
        System.out.println(H);
        System.out.println(H.hashCode());//if you have in the sout then give the hashcode
        System.out.println(H.contains(5));



    }
}
               /*put(), putAll(), putIfAbsent(), get(), getOrDefault(), remove(),
                containsKey(), containsValue(), keySet(), values(), entrySet(), size(), isEmpty(),
                clear(), compute(), computeIfAbsent(), computeIfPresent(), forEach(), merge(),
                replace(), replaceAll()

*/

