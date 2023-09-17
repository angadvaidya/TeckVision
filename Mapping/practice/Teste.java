package Mapping.practice;



/*        import java.util.*;

class WordStats {
    int charCount;
    int intSum;

    public WordStats(int charCount, int intSum) {
        this.charCount = charCount;
        this.intSum = intSum;
    }
}

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String[] words = inputSentence.split("  ");

        Map<String, WordStats> wordStatsMap = new HashMap<>();

        for (String word : words) {
            int charCount = 0;
            int intSum = 0;

            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    charCount++;
                } else if (Character.isDigit(c)) {
                    int num = Character.getNumericValue(c);
                    intSum += num;
                }
            }

            wordStatsMap.put(word, new WordStats(charCount, intSum));
        }

        System.out.println("Word Statistics (Characters and Integer Sum):");
        for (Map.Entry<String, WordStats> entry : wordStatsMap.entrySet()) {
            String word = entry.getKey();
            WordStats stats = entry.getValue();
            System.out.println("'" + word + "': Characters = " + word.replaceAll("[^a-zA-Z]", "") + ", Integer Sum = " + stats.intSum);
        }
    }
}*/

/*class Test {
    public static void main(String[] args) {


        String sr = "we53 ar4e3 ja5va";
        String s[] = sr.split(" ");
        String num[]=sr.split("");
        for(int i=0; i<=sr.length();i++){
            num= new String[]{num + sr};
        }
        for (String y : s) {
            System.out.println(y);
        }
        System.out.println(num);

        }

    }*/


//corrector array
/*
    class Teste{
        public static void main(String[] args) {
            String s="saurab";
            char ch[]=s.toCharArray();
            for(int i=0;i<s.length();i++){
                System.out.print(ch[i]+" "+s);
            }

        }
    }
*/

/*
//splite of charactore
class Test{
    public static void main(String[] args) {
        String s="pankudi verma";
        String s1[]=s.split(" ");
        for(int i=0;i<s1.length;i++) {
            for(int j=s1[i].length()-1;j>=0;j--){
                System.out.print(s1[i].charAt(j));
            }
            System.out.println(" ");

        }
    }
}
*/

/*
        int sum=0;
        for (int i=0; i<sr.length();i++) {
            if (Character.isDigit(sr.charAt(i)))
            {
                number = number + sr.charAt(i);
            }else{
                if (!number.equals("")) ;
                {
                    sum = sum + Integer.parseInt(number);
                    number = " ";

                }

            }
        }
            System.out.println(sum);


        }


    }

*/
//String to integer value and number
        /*class Teste{
            public static void main(String[] args) {
                String s="1234";
                int number=Integer.parseInt(s);
                System.out.println(number);
                int number2=Integer.valueOf(s);
                System.out.println(number2);
            }
        }*/

/*class Test{
    public static void main(String[] args) {
        String s="12saurab133vijay";
   //     String num="";
    //    int sum=0;
        System.out.println(show(s));
   //     System.out.println(sum);
    }
    static String show(String s) {
        return s.replaceAll("\\d", " ");
    }
}*/
/*
class Test {
    public static void main(String[] args) {
        String s = "hello3 4 java64";
        String num = "";
        int sum = 0;
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int va = 0;

                arr[i] = va * 10 + (ch - '0');
                sum = sum+ arr[i];
            }

        }
        System.out.println(sum);
    }

}

*/

/*import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class WordStats {
    int charCount;
    int intSum;

    public WordStats(int charCount, int intSum) {
        this.charCount = charCount;
        this.intSum = intSum;
    }
}

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String[] words = inputSentence.split("  ");

        Map<String, WordStats> wordStatsMap = new HashMap<>();

        for (String word : words) {
            int charCount = 0;
            int intSum = 0;

            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    charCount++;
                } else if (Character.isDigit(c)) {
                    int num = Character.getNumericValue(c);
                    intSum += num;
                }
            }

            wordStatsMap.put(word, new WordStats(charCount, intSum));
        }

        System.out.println("Word Statistics (Characters and Integer Sum):");
        for (Map.Entry<String, WordStats> entry : wordStatsMap.entrySet()) {
            String word = entry.getKey();
            WordStats stats = entry.getValue();
            System.out.println("'" + word + "': Characters = " +
                    word.replaceAll("[^a-zA-Z]", "")
                    + "," + " Integer Sum = " + stats.intSum);
        }
    }
    }*/

/*
class Test {
    public static void main(String[] args) {
        String word= "classmentsto";
        int[] wordCount = new int[256];
        for (char c : word.toCharArray()) {
            wordCount[c]++;
        }
        System.out.println("duplicate element count");

        for (int i = 0;i< wordCount.length;i++){
            if(wordCount[i]>1){
                System.out.println((char)i+" ");
            }
        }
    }
}*/
/*
class Test{
    public static void main(String[] args) {
        String s="java";
        int v=245;
        char[]ch=s.toCharArray();
        Map<String, Integer> map=new HashMap<>();
        for(char c:ch){
            if(!map.containsKey(c)){
                map.put(s,v);
                System.out.println(map);

            }
        }



    }
}
*/

