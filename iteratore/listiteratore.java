package iteratore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listiteratore {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("abcd");
        list.add("1abcd");
        list.add("2abcd");
        list.add("3abcd");
        list.add("4abcd");
        list.add("5ABCD");
        list.add("*");/*
        System.out.println("original list"+list);
        Collections.sort(list);
        System.out.println("sorting list "+ list);*//*
        Iterator<String>iterator=list.iterator();
        list.add("ghjg");
        System.out.println("Iteratore of " +list);
        list.add(2,"lkj");
        System.out.println(list);
        System.out.println(list.get(5));
        System.out.println(list.retainAll(Collections.singleton("hkjh")));
        System.out.println(list.isEmpty());
        System.out.println(list.stream().iterator());
        list.toArray();
        System.out.println(list);*/



       Iterator<String>iterator1=list.listIterator();
        list.remove(1);
        System.out.println("iteratore of removing"+ list);
        Iterator<String>iterator2= list.listIterator();
        while(list.listIterator().hasPrevious());
        String s=iterator2.next();
        System.out.println( "removing element  "+ s);
        Iterator<String>iterator=list.listIterator();
        while(iterator.hasNext());
        System.out.println(list.hashCode());

    }
}
