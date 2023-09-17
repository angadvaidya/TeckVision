package Streampractice;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static <ComparableName> void main(String[] args) {


        List<String> obj = new ArrayList<>();
        obj.add("vijay");
        obj.add("saurab");
        obj.add("akash");
        obj.add("shubham");
        obj.add("sham");
        obj.add("devidas");
        for (String nn : obj) {
            if (nn.startsWith("a")) {
                System.out.println(nn);
            }

            }
        }
    }

