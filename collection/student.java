package collection;

public class student {
   private int age;
    private String Name;
    private long number;

    public student() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", Name='" + Name + '\'' +
                ", number=" + number +
                '}';
    }

    int show(int age, String name, long number){

        return age;

    }
}
