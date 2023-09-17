package Finalimmutable;
public class immutable2 {
    public static void main(String[] args) {

    }

}


 final class immutable02 {
    private String name="shau";
    private int id=101;

      immutable02(String name,int id){
         System.out.println(""+name+" "+id);
    }

    public String getName() {
        return name;
    }
    public int getId(){
          return id;
    }

}
