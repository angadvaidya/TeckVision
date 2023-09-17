package constractore;
class production{
    production(){
        System.out.println("complete the job");
    }
    production(String a,String b,String c){
        System.out.println("gear is complete in this company");

    }
    production(String a,String n)
    {
        System.out.println("you call the assembly line");
    }

}
class assembli extends production{
    assembli(int a, int b,float c){
        System.out.println("hello sir are you complete job");

    }
    assembli(String n,long l,int a){
        System.out.println("yes sir i have complete the job i waiting the your call");
    }
    assembli(String a){
        System.out.println("ok sir i have complete the job i will sending the assemble line");
    }
}

public class mahindra extends assembli {
    mahindra()
    {
        super("waiting");
        System.out.println("hello sir your job finnish,after shear the market");
    }
    void mahindra(){
        System.out.println("ok sir i waiting your job");

    }
  void mahindra(int a){
       System.out.println("ok i meet the job");
    }

    public static void main(String[] args) {
        mahindra Hp=new mahindra();

    }
}
