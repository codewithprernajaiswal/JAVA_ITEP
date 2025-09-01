interface SmartDevice{
    void connectWifi();
}
abstract class  Appliance {
    private String name;
    private int power;
    private boolean status;

    public Appliance(String name,int power){
        this.name=name;
        this.power=power;
        this.status=false;
    }
    public String getname(){
        return this.name;
    }
    public int power(){
        return this.power;
    }

    public boolean getstatus(){
        return this.status; 
    }
    public void setstatus(boolean status){
        this.status=status;
    }
    abstract public void turnon();
    abstract public void turnoff();
    public void showstatus(){
      System.out.println(getname() + " is " + (getstatus() ? "ON" : "OFF"));
    }
    
}
class Fan extends Appliance{
    public Fan(String name,int power){
        super(name, power);
    }
    public void  turnon(){
    //    System.out.println("turn it on ..");
    setstatus(true);
    // System.out.println(getname() + " fan is now ON.");
    }
    public void turnoff(){
        setstatus(false);
// System.out.println(getname()+"trun in off");
    }
    
}
class Light extends Appliance implements SmartDevice{
    public Light(String name,int power){
        super(name, power);
    }
    public void turnon(){
        setstatus(true);
    }
    public void turnoff(){
        setstatus(false);
    }
 public void connectWifi(){
        System.out.println("lights are connnected to wifi");
    }
}
class WashingMachine extends Appliance implements SmartDevice{
    public WashingMachine(String name,int power){
        super(name ,power);  
      }
       public void turnon(){
        setstatus(true);
    }
    public void turnoff(){
        setstatus(false);
    }
    public void connectWifi(){
        System.out.println("WashingMachine are connnected to wifi");
    }


}
class Test{
    public static void main(String args[]){
        Fan f=new Fan("bajaj fan ",200);
        f.showstatus();
        f.turnon();
        f.showstatus();
         f.turnoff();
         f.showstatus();
          Light l=new Light(" light ",200);
           l.showstatus();
           l.connectWifi();
        l.turnon();
        l.showstatus();
         l.turnoff();
         l.showstatus();
         WashingMachine m=new WashingMachine(" washingmachine ",200);
           m.showstatus();
           m.connectWifi();
        m.turnon();
        m.showstatus();
         m.turnoff();
         m.showstatus();
      
      
    }
}