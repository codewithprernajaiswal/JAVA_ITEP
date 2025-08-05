class Question3{
    public  static void main(String args[]){

  int tl=13;
     int tb=7;
     int areaoftile=tl*tb;
     int len=520;
     int bdth=140;
     int areaoffloor=len*bdth;
     System.out.println("area of flor="+areaoffloor);
     System.out.println("areaoftile="+areaoftile);
     int tiles=areaoffloor/areaoftile;
     System.out.println("no of tile="+tiles);
    }
}