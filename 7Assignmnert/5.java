class Product{
    private int id;
    private String name;
    private int quantity;
    private int price;

    public void setId(int id){
    this.id=id;
    }
   public void setName(String name){
    this.name=name;
    }
    public void setQuantity(int quantity){
    this.quantity=quantity;
    }
    public void setPrice(int price){
    this.price=price;
    }
    public void display(){
        System.out.println("product inventry");
        System.out.println("product id ="+id);
         System.out.println("product name ="+name);
         System.out.println("product quantity ="+quantity);
         System.out.println("product price ="+price); 
         System.out.println.("total value ="+quantity*price);
          

    }
}

class Test{
    public static void main(String args[]){
        Product obj=new Product();
        obj.setId(102);
        obj.setName("pen");
        obj.setQuantity(3);
        obj.setPrice(10);
        obj.display();
    }
}