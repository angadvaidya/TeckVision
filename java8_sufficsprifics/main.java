package java8_sufficsprifics;

/*
public class main {
    public static void main(String[] args) {
        StringJoiner stringJoiner=new StringJoiner("," , "#" , "#");
        stringJoiner.add("interview");
        stringJoiner.add("improvement");
        stringJoiner.add("deligation");
        System.out.println("String after adding # in suffix and prefix :");
        System.out.println(stringJoiner);


    }
}
*/
/*
public class main {
    public static void main(String[] args)
    {
        TreeMap<Integer, String> m =
                new TreeMap<Integer, String>((o1, o2) -> (o1 > o2) ?
                       -1 : (o1 < o2) ? 1 : 0);
        m.put(1, "Apple");
        m.put(4, "Mango");
        m.put(5, "Orange");
        m.put(2, "Banana");
        m.put(3, "Grapes");
        System.out.println("Elements of the TreeMap " +
                "after sorting are : " + m);
    }
}*/
/*
public class main {
    public static void main(String[] args)
    {
        TreeSet<Integer> h =
                new TreeSet<Integer>((o1, o2) -> (o1 < o2) ?
                        -1 : (o1 > o2) ? 1 : 0);
        h.add(850);
        h.add(235);
        h.add(1080);
        h.add(15);
        h.add(5);
        System.out.println("Elements of the TreeSet after" +
                " sorting are: " + h);
    }
}*/
// Use a lambda expression to create a reverse comparator
import java.util.*;

class main{
    public static void main(String args[]){

        // Pass a reverse comparator to TreeSet() via a lambda expression
        TreeSet<String> ts=new TreeSet<String>((aStr,bStr) -> aStr.compareTo(bStr));

        // Add elements to the Treeset
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        ts.add("F");
        ts.add("G");

        //Display the elements .
        for(String element : ts)
            System.out.println(element + "");

        System.out.println();
    }
}
