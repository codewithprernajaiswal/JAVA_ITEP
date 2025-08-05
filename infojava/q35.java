class Program35{
    public static void main(String args[]){
        double r=7.7;
        double h=12.0;
        double pi=3.1416;
    
        double surface =pi*r*(r+h);
        System.out.println("cylinder area="+surface);

        // q36
        double r=15.0/2;
        double h=7.0;
        double pi=3.1416;
    
        double surface =pi*r*(r+h);
        System.out.println("cylinder area="+surface);

        // q38
        double volume =1287.0;
        double r=10.0;
        
        double pi=3.1416;
        double h=volume/pi*r*r;
        double surface =pi*r*(r+h);
        System.out.println("h="+h);
        System.out.println("surface  area="+surface);

        // q39
      int r=12/2;
      int h=9.0;
      double p=3.1416;
    
      double surface=2*pi*r*(r+h);
      System.out.println("surface  area="+surface);
        

    }
}