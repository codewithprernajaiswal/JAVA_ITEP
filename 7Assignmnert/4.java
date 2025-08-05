class Car{
    private String brand;
    private String model;
    private int year;

    public void setBrand(String brand){
        this.brand=brand;
    }
    
    public void setModel(String Model){
        this.model=model;
    }
    
    public void setYear(int year){
        this.year=year;
    }
    public void show(){
        System.out.println("car's brand="+brand);
         System.out.println("car's model="+model);
          System.out.println("car's year="+year);
    }
}

class Test{
    public static void main(String args[]){
        Car c=new Car();
        c.setBrand("xyz");
        c.setModel("xyz2");
        c.setYear(2024);
        c.show();
    }
}