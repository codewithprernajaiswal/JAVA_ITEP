class Mobile{
  
    private String brand;
    private String model;
    private int price;

    public void setBrand(String brand){
        this.brand=brand;
    }
    
    public void setModel(String Model){
        this.model=model;
    }
    
    public void setPrice(int price){
        this.price=price;

    }
    public boolean isAffordable(){
        if(price<20000){
            return true;
        }
        return false;
    }

    public void show(){
        System.out.println("mobile's brand="+brand);
         System.out.println("mobile's model="+model);
          System.out.println("mobile's price="+price);
           if (isAffordable()) {
            System.out.println("mobile is a affordable");
        } else {
            System.out.println("mobile is NOT a affordable.");
        }
    }
    }


class Test{
    public static void main(String args[]){
        Mobile m=new Mobile();
        m.setBrand("xyz");
        m.setModel("xyz2");
        m.setPrice(202400);
        m.show();
    }
}
