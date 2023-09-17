package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//add(), addAll(), remove(), removeAll(), contains(), containsAll(),
// retainAll(), size(), clear(), isEmpty(), iterator(), spliterator(),
// toArray(), copyOf(), of()
public class collection_arrayList {
    public static void main(String[] args) {
        List student = new ArrayList<>();
        student.add("sham");
        student.add("vector");
        student.add("shubham");
        student.add("vijay");
        student.add("archena");
        student.add("mangesh");
        student.add("shamsunder");
        List sam = new ArrayList<>();
        sam.add(25);
        sam.add(58);
        sam.add("akash");
        sam.add("vijay");

      /*  System.out.println(student);
        student.remove(5);
        System.out.println(student);
        student.add("sham");
        System.out.println(student);
        student.set(5,"om");
        System.out.println(student);*/
        //add(), addAll(), remove(), removeAll(), contains(), containsAll(),
// retainAll(), size(), clear(), isEmpty(), iterator(), spliterator(),
// toArray(), copyOf(), of()
        /*student.addAll(sam);
        System.out.println(student);
        System.out.println(student.contains(58));*/
/*
        System.out.println(student.containsAll(sam));
        System.out.println(sam);
        System.out.println(student);
        System.out.println(sam.size());
        sam.clear();
        System.out.println(sam);
*/
        System.out.println(sam);
        System.out.println(sam.iterator());
        Iterator sam1 = sam.listIterator();
        while (sam1.hasNext()) {
            System.out.println(sam1.next());
            //     student.retainAll(sam);//if you want to the two class in the  same name  then print same name
            //System.out.println(student);
/*
        student.spliterator();
        while(sam1.hasNext()) {
            System.out.println(student);
        }
*/

/*
       String a="java";
        String b="program";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("swap a: "+a+"   swap b: "+b);
*/
            student.toArray();
            System.out.println(student);


        }
    }
}
