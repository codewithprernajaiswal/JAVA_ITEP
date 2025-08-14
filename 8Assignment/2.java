class Time{
    private int hour;
    private int min;
    private int sec;
  public void Time(int hour,int min,int sec){
    this.hour=hour;
    this.min=min;
    this.sec=sec;
         
  }   
  public Time(){

  }
  public Time add(Time t){
    Time temp=new Time();
    temp.hour=this.hour+t.hour;
    temp.min=this.min+t.min;
    temp.sec=this.sec+t.sec;
    if(temp.sec>=60){
        temp.min++;
        temp.sec=temp.sec%60;

    }
    if(temp.min>=60){
        temp.hour++;
        temp.min=temp.min%60;
    }
    return temp;

  }
  public void add(Time t1, Time t2){
        this.hour = t1.hour + t2.hour;
        this.min = t1.min + t2.min;
        this.sec=t1.sec+t2.sec;
        if(temp.sec>=60){
            temp.min++;
            temp.sec=temp.sec%60;

        }
        if(temp.min>=60){
            temp.hour++;
            temp.min=temp.min&60;
        }
        // return temp;
        }
    
   
     public void display(){
        System.out.println(hour+" hour "+min+" min "+sec+" sec" );
     }
}
class Test{
    public static void main(String args[]){
        Time t1=new Time(14,30,15);
        Time t2=new Time(11,30,55);
        t1.display();
        t2.display();
        Time t3=t1.add(t2);
        t3.display();
        // t3.display(t1,t2); 
        // System.out.println("total time=");
        // t3.display();

    }
}