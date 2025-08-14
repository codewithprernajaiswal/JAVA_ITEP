class Time{
    private int hour;
    private int min;
    private int sec;
    public Time(int hour,int min,int sec){
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }
    public Time(){
        hour=min=sec=0;
    }
    public Time add(Time t){
        Time temp=new Time();
        temp.hour=this.hour+t.hour;
        temp.min=this.min+t.min;
        temp.sec=this.sec+t.sec;
        if(temp.min>=60){
            temp.hour++;
            temp.min=temp.min%60;
        }
       
        if(temp.sec>=60){
            temp.min++;
            // temp.sec++;
            temp.sec=temp.sec%60;
        }
        return temp;
    }
    public int gethour(){
        return hour;
    }
    public int getmin(){
        return min;
    }
    public int getsec(){
        return sec;
    }
}

class Test{
    public static void main(String args[]){
        Time t1=new Time(14,30,15);
        Time t2=new Time(11,30,55);
        Time res=t1.add(t2);
        System.out.print(res.gethour()+" "+res.getmin()+" "+res.getsec());
    }
}