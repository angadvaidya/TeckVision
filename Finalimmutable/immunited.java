package Finalimmutable;

public final class immunited {
    private final int id;
    private final String name;

    immunited(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static immunited getId() {
        return getId();
    }

    public static immunited getname() {
        return getId();

    }

    public static void main(String[] args) {
        immunited s=new immunited(1,"java");
        immunited s1=new immunited(2,"java");
        System.out.println(s.name =="java");
      //  System.out.println(getname());
    }
}