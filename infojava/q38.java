class Program38{
    public static void main(String args[]){
 double volume =1287.0;
        double r=10.0;
        
        double pi=3.1416;
        double h=volume/pi*r*r;
        double surface =pi*r*(r+h);
        System.out.println("h="+h);
        System.out.println("surface  area="+surface);

    }
}