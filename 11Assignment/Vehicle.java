interface Chargeable{
 void chargeBattery();
}

abstract class Vehicle {
  private String  n;
  public Vehicle(String  n){
    this.n=n;
  } 
  public String getrno(){
    return n;
  }
  abstract public void start();
 abstract public void stop();
//  abstract  public void run();
public void display(){
    System.out.println("vehicle register number .. "+n);
}

}

class Car extends  Vehicle{
    public Car(String n){
        super(n);
    }


 public void stop(){
    System.out.println("Car"+ getrno()+"stopped");
 }
 public void start(){
    System.out.println("car "+getrno()+"starting with petrol engine...");
 }
}
class Truck extends Vehicle {
    public Truck(String n){
        super(n);
    }

    public void start(){
        System.out.println("Truck"+getrno()+" starting with diesel engine...");
    }
    public void stop(){
        System.out.println("Truck "+getrno()+" stopped.");
    }

}
class ElectricBike extends Vehicle implements Chargeable{
    public ElectricBike(String n){
        super(n);
    }

   
        public void start(){
        System.out.println("Electric bike "+getrno()+"starting silently...");
        
    }
    public void chargeBattery(){
    System.out.println(" Electric bike"+getrno()+"  battery charging...");
}
public void stop(){
    System.out.println("Electric Bike"+getrno()+" stopped.");
}
} 
class  ElectricCar extends Vehicle implements Chargeable{
     public ElectricCar(String n){
        super(n);
    }

     public void start(){
        System.out.println("Electric car "+getrno()+"starting silently...");
        
    }
    public void chargeBattery(){
    System.out.println(" Electric car"+getrno()+"  battery charging...");
}
public void stop(){
    System.out.println("Electric Bike"+getrno()+" stopped.");
}
}
class Test{
    public static void main(String args[]){
        Car c=new Car(" KA01AB1234");
        c.start();
        c.stop();
        Truck t=new Truck("KA02XY9876");
        t.start();
        t.stop();
        ElectricCar ec=new ElectricCar("KA04EV4321");
        ec.start();
        ec.chargeBattery();
        ec.stop();
        ElectricBike b=new ElectricBike("ElectricBik");
        b.start();
        b.stop();
        b.chargeBattery();

        
    }
}