
// 4. E-commerce Discount Calculation

// Suppose you are dividing total amount by quantity to get per item price. If quantity = 0, what happens?

// Which exception will occur?

// How will you ensure the program continues and doesn’t stop execution?
class Discount{
      public void Qunatity(int amt,int quantity){
        try{
        int peritem=amt/quantity;
        System.out.println("per item price= "+peritem);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
         System.out.println("Program continues...");
      }
}
class Test{
    public static void main(String args[]){
        Discount s=new Discount();
        s.Qunatity(1200, 0);
        s.Qunatity(1200, 6);
    }
}