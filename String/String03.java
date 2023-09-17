package String;

public class String03 {
    public static void main(String[] args) {
        String r = new String("quick to job");
        String r1 = new String("go to hell");
        String r3 = "immutable";
        String r4 = "immutable";
        System.out.println("same to "+r.length());
        System.out.println("Charchar   "+r.charAt(4));
        System.out.println("substring "+r.substring(5));
        System.out.println("sustring "+r.substring(2,8));
        System.out.println(" "+r.concat(r1));
        System.out.println(+r.indexOf("o"));
        System.out.println(+r.indexOf("k",2));
        System.out.println(" " +r.indexOf('c',5));
        System.out.println(""+r.lastIndexOf('k','j'));

    }
}
