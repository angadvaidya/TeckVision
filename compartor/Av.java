package compartor;

public class Av{
    int Id;
    String name;
    float salary;
    int A(int Id,String name,float salary){
        System.out.println("Id no: "+Id +"Name:"+name+"salary:"+salary);
        return 0;
    }
    public static void main(String[] args){

        Av P=new Av();
        P.A(5,"java",80000);
    }
}
