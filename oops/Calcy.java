package oops;

public class Calcy {
    public float  add(){
        String Name="suyesh";
        int math=78;
        int chem=85;
        int phys=65;
        int Bio=85;
        float addition= math+chem+phys+Bio;
       System.out.println(addition/4) ;
        return addition;
    }
    public static void main(String []args){
        Calcy obj=new Calcy();
        System.out.println(obj.add());

    }


}
