//  1. Banking System – Insufficient Balance

// You are building a banking system. A user tries to withdraw more money than available in their account.

// Which exception would you throw?

// Will you use a checked or unchecked exception? Why?

// Write a custom exception InsufficientBalanceException. 
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(){
        super("Insufficient Balance");
    }
}
class BankingSystem{
    private double amount;
    public BankingSystem(){

    }
    public void deposit(int amount){
        this.amount+=amount;
    }
    public void withdraw(int amount) throws InsufficientBalanceException{
        if(this.amount<amount ){
            throw new InsufficientBalanceException();
    }else{
        this.amount-=amount;
    }
    display();

}
    public void display(){
        System.out.println("your current balance is "+this.amount);
    }
}
class Test{
    public static void main(String args[]){
        BankingSystem user1=new BankingSystem();
        user1.deposit(5000);
        user1.display();
        user1.deposit(1234);
         user1.display();
         try{
        user1.withdraw(8000);
    }catch(InsufficientBalanceException e){
        e.printStackTrace();
    }
}
}
    

