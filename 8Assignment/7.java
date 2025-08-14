import java.util.ArrayList;
class Bank{
    ArrayList<Account>al=new ArrayList<Account>();
    public void addAccount(Account account){
        al.add(account);

    }
    public void removeAccount(Account account){
        al.remove(account);
    }
    public void displaymyAccountDetails(){
        for(Account account :al){
            System.out.print(account.getFullAccountDetail());
        }
    }
}
class Account{
    private String holderName;
    private String contact;
    private int balance;
    public Account(String holderName,String contact,int balance){
        this.holderName=holderName;
        this.contact=contact;
        this.balance=balance;
    }
    public Account(){}
    public String getFullAccountDetail(){
        return holderName+" : "+contact+" : "+balance;
    }
    }

class Test{
    public static void main(String args[]){
        Account o1=new Account("chiku","14556633555",500000);
        Account o2=new Account("piku","14566884455",622000);
        Account o3=new Account("ritu","47896666666",875456);
        Bank icici=new Bank();
        icici.addAccount(o1);
        icici.addAccount(o2);
        icici.addAccount(o3);
        icici.displaymyAccountDetails();
        System.out.println("-------------------------------------");
        icici.removeAccount(o1);
        icici.displaymyAccountDetails();

    }
}