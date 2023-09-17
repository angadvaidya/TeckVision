package Finalimmutable;

public final class immutable1 {
    private final int id;
    private final String name;

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public immutable1(int i,String s){
        this.id=i;
        this.name=s;
    }

    public static void main(String[] args) {
        immutable1 a=new immutable1(1,"java");
        immutable1 b=new immutable1(2,"java");
       // immutable1 a=new immutable1(3,"my");
        System.out.println(a.name=="java");
      //  System.out.println(b.name=="");
        System.out.println();
    }

}
