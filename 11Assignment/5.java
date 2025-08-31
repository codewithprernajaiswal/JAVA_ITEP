abstract class  Appliance {
    private String name;
    private int power;
    public Appliance(String name,int power){
        this.name=name;
        this.power=power;
    }
    abstract public void turnon();
    abstract public void turnoff();
    public void sowstatus(){

    }
    
}
class Fan extends Appliance{
    public Fan(String name,int power){
        super(name, power);
    }
    public void  turnon(){
       System.o
    }
    public void turnoff(){

    }
}
class Test{
    public static void main(String args[]){
        Fan f=new Fan("bajaj",200);
        f.showStatus();
        f.turnon();
         f.turnoff();
    }
}