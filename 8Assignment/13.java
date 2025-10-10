import java.util.ArrayList;
// 13. Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.
class Inventory{
    ArrayList<Products>pl=new ArrayList<Products>();
//  

//  public Inventory(String products){
    

//  }
public void addProduct(Products p){
   pl.add(p);
 }
 public void removeProduct(Products p){
    pl.remove(p);
 }
 public void Display(){
    
    for(Products p:pl){
       p.display();
    }
 }
  public void lowinventory(){
    if(pl.size()<10){
        System.out.println(" low inventory...");

    }else{
        System.out.println("not in low inventory...");
    }
 }

}
class Products{

 private String name;
 private int productQ;
 public Products(){}
 public Products(String name,int productQ){
    this.name=name;
    this.productQ=productQ;
 }
 
 public void display(){
    System.out.println("product name "+name+" quantity "+productQ);
 }
//  public void lowinventory(){
//     if(.size()<10){
//         System.out.println(" low inventory...");

//     }else{
//         System.out.println("not in low inventory...");
//     }
//  }

}
class Test{
    public static void main(String args[]){
        Products p1=new Products("car1 ",2);
        Products p2=new Products("car2 ",2);
        Products p3=new Products("car3 ",2);
        Products p4=new Products("car 4 ",2);
        Inventory inven=new Inventory();
        inven.addProduct(p1);
        inven.addProduct(p2);
        inven.addProduct(p3);
        inven.addProduct(p4);
        inven.Display();
        inven.removeProduct(p3);
        inven.Display();
        inven.lowinventory();
    }
}