/*Shopping Cart
While calculating total price, one product’s price is missing (null).
What exception will occur?
How would you handle it? (Default price, error message, or skip item?)*/

class Product {
    String productName;
    Integer productPrice; 

    public Product(String name, Integer price) {
        this.productName = name;
        this.productPrice = price;
    }
}
class ShoppingCart{
    Product[] products;

    public ShoppingCart(Product[] products){
        this.products = products;
    }
    public int CalculateTotal(){
        int total = 0;
        for(Product p : products){
            try{
            total += p.productPrice;
       }
        catch(NullPointerException e){
           System.out.println("Price missing for porduct "+p.productName);
        }
      }
      return total;

    }
}
class Test{
    public static void main(String args[]){
        
        Product p1 = new Product("Shoes", 2000);
        Product p2 = new Product("Shirt", null);
        Product p3 = new Product("Jeans", 1500);

        Product[] items = {p1,p2,p3};

        ShoppingCart s = new ShoppingCart(items);
        int total = s.CalculateTotal();

        System.out.println("Total amount "+total); 
    }


}

