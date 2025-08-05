class Bank{
    private int accountnumber;
    private String holdername;
    private double balance;

    public void setAcnum(int accountnumber){
     this.accountnumber=accountnumber;
    }
    public void setName(String  holdername){
     this.holdername=holdername;
    }
    public void setBalance(double balance){
     this.balance=balance;
    }
    public void display(){
        System.out.println("Bank Account number="+accountnumber);
        System.out.println("Bank Account holder name="+holdername);
        System.out.println("Bank Account balance="+balance);
    }
}
 class Test{
    public static void main(String args[]){
        Bank b=new Bank();
        b.setAcnum(100020);
        b.setBalance(10000000);
        b.setName("khushi");
        b.display();
    }
 }