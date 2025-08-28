
// 18) Create class Product (pid, price, quantity) with parameterized constructor.Create a main function in different class (say XYZ) and perform following task:
// Accept five product information from user and store in an array
// Find Pid of product with highest price.
// Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products. (amount spent on single product=price of product * quantity of product).
import java.util.ArrayList;
class XYZ{
    ArrayList<Product>plist=new ArrayList<Product>();
    
   public void addp(Product p){
       plist.add(p);
   }
//    public void remove(Product p){
//     plist.remove(p);
//    }
public int totalspend(){
    int total=0;
    for(Product p:plist){
        total=total+p.getPrice()*p.getQuantity();
    }
    return total;
}
public int highestproduct(int pid){
    for(Product p:plist){
        if(p.getprice()>maxp){
            int temp=maxp;
            maxp=
        }
    }
}

   public void display(){
    for(Product product:plist){
        System.out.println(product.getdetail());
    }
   }

    }
class Product{
    private int pid;
    private int price;
    private int quantity;

    public Product(int pid,int price,int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }
    public int getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getdetail(){
        return "pid="+pid+"price="+price+"quantity="+quantity;
        
    }


}
class Test{
    public static void main(String args[]){
        XYZ o=new XYZ();
        Product p1=new Product(1,20,5);
        Product p2=new Product(2,30,5);
        Product p3=new Product(3,10,5);
        o.addp(p1);
        o.addp(p2);
        o.addp(p3);
        o.display();
        System.out.println("total spend on product="+o.totalspend());


    }
}