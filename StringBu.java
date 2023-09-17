
/*
public class StringBu {
    public static void main(String[] args) {
        String a="vaidya";
        String b="angad";
      String fullName=a+b;
     System.out.println(fullName.length());//if you want to length;
         System.out.println(fullName);//if you want to concatenation;

        for(int i=0;i<=fullName.length();i++)//if you want to row number of charectar;
        {
            System.out.println(fullName.charAt(i));
        }
    }
}


*/
/*

public class StringBu {
    public static void main(String[] args) {
        String n="program";
        for(int i=n.length()-1;i>0;i--){
            System.out.print(n.charAt(i));
        }
    }
}
*/

/*
public class StringBu{
    public static void main(String[] args) {
        String n="vijay ";
        */
/*for(int i=n.length()-1;i>0;i--){
            System.out.print(n.charAt(i));
        }*//*

        String rev=" ";
        for(int i=0;i<=n.length()-1;i++){
            char ch=n.charAt(i);
            rev=ch+rev;
        }
            System.out.print(rev);
        }


}
*/
/*
public class StringBu {
    public static void main(String[] args) {
        String n = "vaidya angad";
        String s[] = n.split("");
        for (int i = 0; i < s.length; i++) {
            for (int j = s[i].length() - 1; j >= 0; j--) {
                System.out.print(s[i].charAt(j));
            }


            System.out.println(" ");
        }

    }
}
*/
/*
class StringBu {
    public static void main(String[] args) {
        String t = "java is programing lauges";
        String sv[] = t.split(" ");
        for (int i = 0; i < sv.length; i++) {
            for (int j = sv[i].length() - 1; j >= 0; j--) {
                System.out.print(sv[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
*/
class SpringBu{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,6,7,5};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                System.out.println(a[i]);
            }
        }
    }
}}
/*class SpringBu {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = i; j <= n; j++)
                System.out.print("@");
            for (int j = 0; j <= i; j++)
                System.out.print("%");
        }
        System.out.println(" ");
    }
}*/
