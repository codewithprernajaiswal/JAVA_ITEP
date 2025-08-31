abstract class Payment{
    private int amount;
    public Payment(int amount){
        this.amount=amount;
    }
    public int getamt(){
        return amount;
    }
    abstract public void pay();
    public void paymentDetail(){
       System.out.println("Payment of amount: rs"+amount);
    }
} 
interface Refundable{
    void processRefund();
}
class CreditCardPayment extends Payment implements Refundable {
    public CreditCardPayment(int amount){
        super(amount);
    }
   public void pay(){
    System.out.println("payment of "+getamt()+"through CreditCardPayment...");
   }
   public void processRefund(){
    System.out.println("credit payment of rs"+getamt()+"got refund ...");
   }
}
class DebitCardPayment extends Payment{
    public DebitCardPayment(int amount){
        super(amount);
    }
    public void pay(){
    System.out.println("payment of "+getamt()+"through DebitCardPayment...");
   }

}
class UPIPayment extends Payment implements Refundable{
    public UPIPayment(int amount){
        super(amount);
    }
    public void pay(){
    System.out.println("payment of "+getamt()+"through UPIPayment...");
   }
   public void processRefund(){
    System.out.println("UPI payment of rs"+getamt()+"got refund ...");
   }     
}
class Test{
    public static void main(String args[]){
       CreditCardPayment c=new CreditCardPayment(25000);
       c.pay();
       c.paymentDetail();
       c.processRefund();
        DebitCardPayment p2=new DebitCardPayment(30000);
        p2.pay();
        p2.paymentDetail();
        // p2.processRefund();
        UPIPayment p=new UPIPayment(40000);
        p.pay();
        p.paymentDetail();
        p.processRefund();
    }
}
