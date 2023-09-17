package constractore;
class india{
    india(){
        System.out.println("india is big and popular");
    }
    india(String name,int population)
    {
        System.out.println("india is 29 state");
    }
    india(int population,String state){
        this("pune",845641654);
        System.out.println("pune population");
    }
    india(String v){
        this(58458584,"maharastra");
        System.out.println("enter the rich maharastra");
    }

}
class japan extends india{
    japan(String n){
        super("madhava");
        System.out.println("japan is popular in mecha");

    }
    japan(int a,String n){
        this("india");
        System.out.println("japan is big diller in word");
    }
    japan(int a,float b,String n){
        this(5,"king_gong");
        System.out.println("japan is techical city");

    }

}

public class word extends japan {
    word(String name){
        super(5,855645f,"japan");
        System.out.println("India is word wor vishavguru:"      +name);

    }
  void  word(){
      System.out.println("India is bigest country");

  }
    void word2(){
        System.out.println("India is bigest popultion");

    }
    public static void main(String[] args) {
        word H=new word("delhi");
        H.word2();
    }

}
