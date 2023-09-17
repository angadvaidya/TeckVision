public class Cat {
    String name;
    int Account;
    float salary;
    double ammount;
    long mobile_no;
    public void H(String name,int Account,float salary,double ammount,long mobile_no ){
        System.out.println(name+"  "+Account+"  "+salary+" "+ammount+" "+mobile_no);
    }
    public int J(String name,int Account,float salary){

        System.out.println(name+"  "+Account+"  "+salary+" ");
        return 45;
    }
    public float J(double ammount,long mobile_no ){
        System.out.println(+ammount+" "+mobile_no);
        return 4.5f;
    }
    public double K(double ammount){
        System.out.println(ammount);
        return 45;
    }
    boolean K(String name,int Account,float salary){
        System.out.println(name+"  "+Account+"  "+salary );
        return true;
    }
    public static void main(String []args){
        Cat obj=new Cat();
        obj.H("angad",789556653,45.2546f,45564545555554d,8408000680l);
        Cat H=new Cat();
        H.J("deelip",98956464,45.45465444f);
        Cat b=new Cat();
        b.J(41651651651f,4513213445456l);
        b.K(445531654644d);
        Cat m=new Cat();
        m.K("kohali",845645,45.5456445454f);

    }


    }
