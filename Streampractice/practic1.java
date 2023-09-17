package Streampractice;

import java.util.ArrayList;
import java.util.List;

public class practic1 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("vijay");
        list.add("saurab");
        list.add("shubham");
        list.add("mangesh");
        list.add("aijay");
        list.add("mijay");
        list.add("pijay");
        list.add("lijay");
        for(String M:list)
        {
            if(M.startsWith("a")){
                System.out.println("yes i have");

            }
        }




    }
}
