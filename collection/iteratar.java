package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class iteratar {
    public static void main(String[] args) {
/*
        ArrayList<Integer> obj = new ArrayList();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        System.out.println("element of ArrayList");
        for (Integer T : obj) {
            System.out.println(T);
        }
        ListIterator<Integer>l= obj.listIterator();
        l.next();
        l.hasPrevious();
        l.set(500);
       l.set(400);
       l.set(300);
        System.out.println(l.hasPrevious());
        System.out.println("this element of ListIterator");
        for(Integer b:obj){
            System.out.println(b);

*/
        List<String> kill = new ArrayList();
        kill.add("10");
        kill.add("45");
        kill.add("shubham");
        kill.add("78");
        kill.add("58");
        kill.add("kindly");
        kill.remove("78");
        kill.remove("45");
        System.out.println(kill);
        kill.remove("kindly");
        System.out.println(kill);

        ListIterator red = kill.listIterator();
        System.out.println("it is first message:"+kill);
//        while (red.hasNext()) {
//            System.out.println(red.next());
//        }
//        red.next();
//        red.next();
//        red.next();
//        red.next();
//        red.next();
//        red.next();
//
//
//       while(red.hasPrevious())
//       {
//           System.out.println(red.previous());
//       }


    }
        }




















