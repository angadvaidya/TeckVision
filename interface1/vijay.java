package interface1;

public interface vijay {
    String show(int id,String name,long number);
}
class vijay1 implements vijay{

    @Override
    public String show(int id, String name, long number) {/*
        id=1;
        name="shiva";
        number=4465415134l;*/
        System.out.println("all student name is vijay class"+id+" "+name+" "+number);
        return null;
    }

    public static void main(String[] args) {
        vijay1 k=new vijay1();
        k.show(1,"shiva",78465488444l);

        //Anonymous
        vijay sc=new vijay(){
            @Override
            public String show(int id, String name, long number) {
                System.out.println("enter the name of student name  "+id+ " "+name+ " "+number);

                return (null);
           }
        };
        sc.show(2,"shamba",78454531453l);
        vijay sb=(id,name,number)->{
            System.out.println("enter the name of student name of lambda  "+id+" "+name+" "+number);
            return name;
        };
        sb.show(3,"shaym",4864654534l);

    }
}
