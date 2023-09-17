package kalpewad;

abstract class Bike {
    int a;
    String name;
    int rs;

    abstract void show(String name, int rs, int a);
}
class honda extends Bike {
    void show (String name,int rs,int a){
        System.out.println("Draw the bike and show:"+a+" "+rs+" "+"honda "+ name);
    }
}
class farandey extends honda{
    void show1(){
        System.out.println("faraday honda is nice:"+2+" "+4521255+"faranday honda");
    }
}
class faranday1 extends farandey{
    void internal(String name,int rs,int a){
        System.out.println(":"+"break"+ " "+456654+" "+2);
    }

    public static void main(String[] args) {
        faranday1 A=new faranday1();
        honda B=new honda();
        A.internal("honda",4525665,1);
        A.show1();
        B.show("bicke123",2,56576);
    }
}