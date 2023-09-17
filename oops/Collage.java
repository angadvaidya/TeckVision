package oops;



public class Collage {

    String Name;
    int Id;
    float Marks;
    long MobileNO;
    String Address;

    public void Student1() {
         Name="Rajesh";
        Id=45;
        Marks=78.55f;
        Address="At.post Nanded";
        MobileNO=965255252525l;


        System.out.println("student1 details: "+Name+" "+Id+" "+Marks+" "+Address+" "+MobileNO);
    }
    public void Student2(){
        String Name="umesh";
        int Id=5;
        float Marks=98.54f;
        long MobileNo=8888451237l;
        String Address="At.post Vishupuri";
    }
    public void Student3(){
        String Name="Omkar";
        int Id=4;
        float Marks=89.54f;
        long MobilNo=887799456123l;
        String Address="At.post pune";
    }
    public static void main(String[] args){
        Collage obj=new Collage();
        obj.Student1();
        obj.Student2();

    }

}
