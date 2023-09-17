package String;

public final class immutable {
    private final int id=11;
    private final String name="sham";

    public immutable(int id,String name) {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        immutable im=new immutable(12,"om");
        im.getId();
        im.getName();
        System.out.println(im.id);
        System.out.println(im.name);
    }
}
