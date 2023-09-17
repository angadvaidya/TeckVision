package constractore;
class parote{
    parote() {
        System.out.println("enter the bird ");
    }
    parote(int a,int b,int c)
    {
        System.out.println("weight");
    }
    parote(int a,float b,long c){
        this();
        System.out.println("enter the value");
    }
    parote(String name,long b,int a){
        this(5,10f,745456456415l);
        System.out.println("name of the bird;");
    }

    public parote(String n) {
    }
}
class sparrow extends parote{
    sparrow(int a){
        super("sparrow",8978456453l,4);
        System.out.println("enter the a");
    }

    sparrow(String n) {

        this(844541541l);
        System.out.println("enter the name of sparrow");
    }
    sparrow(long range){
        this(5);
        System.out.println("enrer the range ");
    }
}

public class Bird extends sparrow {

    Bird(){
        super("mangesh");
        System.out.println("wow Bird is nice but which bird");
    }
   void Bird(){
       System.out.println("ther is not mention of bird is nice");
    }


    public static void main(String[] args) {
        Bird bick=new Bird();
        bick.Bird();
    }
}
