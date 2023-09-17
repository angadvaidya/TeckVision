package kalpewad;

abstract class Bank1{
    abstract void show();

}
class SBI25 extends Bank1{
    void show(){
        System.out.println("entrance of profite");
    }
}
class BankOfBadoda1 extends SBI25{
    void print(String name,int renge,float ammount)
    {
        System.out.println("what is name:"+name+" "+renge+" "+ammount);
    }
}
class TechBank extends BankOfBadoda1{
       int gerRateOfIntrance(){


           return 8;
    }
}
class Display{
    public static void main(String[] args) {
        TechBank G=new TechBank();
        G.gerRateOfIntrance();
        G.print("angad",45-45,46546545646f);
        G.gerRateOfIntrance();
    }
}