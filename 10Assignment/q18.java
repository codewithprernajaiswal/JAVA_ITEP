import java.util.Scanner;
class Product{
    private int price;
    private int quantity;
    private int pid;
    public Product(int price , int pid , int quantity){
        this.price = price;
        this.pid = pid;
        this.quantity = quantity;
    }
    public int getPid(){
        return this.pid;

    }
    public int getPrice(){
    return this.price;
    }
    public int getQuantity() {
        return quantity;
    }


}

class XYZ{
    public static int calculateTotalAmount(Product[] products){
        int total=0;
        for(Product p:products){
            total+=p.getPrice()*p.getQuantity();
        }
        return total;
    }
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Product[] products = new Product[5];
 for(int i=0;i<products.length;i++){
    System.out.println("enter detail of product"+(i+1));
    System.out.println("enter product id:");
    int pid=sc.nextInt();
    System.out.println("enter product price=");
    int price=sc.nextInt();
    System.out.println("enter product quantity=");
    int quantity=sc.nextInt();
    products[i]=new Product(pid,price,quantity);  
 } 
 Product highestPriceProduct=products[0];
 for(int i=0;i<products.length;i++){
    if(products[i].getPrice()>highestPriceProduct.getPrice()){
        highestPriceProduct=products[i];

    }
 }   System.out.println("\nProducts with highest price has pid="+highestPriceProduct.getPid());
 int totalamount=calculateTotalAmount(products);
 System.out.println("total amount spend on all products="+totalamount);
    }
}