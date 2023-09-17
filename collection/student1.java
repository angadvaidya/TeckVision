package collection;

import java.util.ArrayList;
class Data{
    int roll;
    String name;
    String college;
    long mobile;

    @Override
    public String toString() {
        return "Data{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}

public class student1 {
    int n=4;
    public void addValues(int roll[],String name[],String college[],long mobile[]){
        ArrayList<
                Data>list=new ArrayList<Data>();
        for(int i=0;i<n;i++){
            Data  data=list.get(i);
            System.out.println(data.roll+" "+data.name+" "+data.college+" "+data.mobile);

        }
    }

    public static void main(String[] args) {
        int roll[]={1,2,3,4};
        String name[]={"Shubham","saurab","vijay","ganesh"};
        String college[]={"coe"};
        long mobile[]={8468465465465l,6546646464l,568468465468l,6846846846l};
        student1 custom=new student1();
        System.out.println(custom.equals(roll+""+name+""+college+ " " +mobile));

    }

}
