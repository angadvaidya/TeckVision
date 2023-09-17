package encapsulation;

public class Account {
    private int account;
    private String name,email;
    private float amount;
    Account(){}
    Account(int accoumt,String name,String email,float amount){
        this.account=account;
        this.name=name;
        this.email=email;
        this.amount=amount;
    }
    public int getAccount(){
        return account;
    }
    public String getName(){
        return name;
    }
    public float getAmount(){
        return amount;
    }
    public String getEmail(){
        return email;
    }
    public void setAccount(int account){
        this.account=account;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setAmount(float amount){
        this.amount=amount;
    }
}
class bank{
    public static void main(String[] args) {
        Account ac=new Account();
        ac.setAccount(4786767   );
        ac.setName("\n aman\n");
        ac.setEmail("satish@gmail.com\n");
        ac.setAmount(100000.000f);
        System.out.println(ac.getAccount()+""+ac.getName()+""+ac.getEmail()+""+ac.getAmount());
    }

}
