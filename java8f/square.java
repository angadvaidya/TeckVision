package java8f;

interface ans{
        void show(int x);

        }

class maza{
    public static void main(String args[]){
        ans st=(int x)->System.out.println(2*x);
        st.show(5);
    }
}
