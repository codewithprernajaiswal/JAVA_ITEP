class Q37{
    public static void main(String args[]){
        int a=149;
        int h=6;
        double pi=3.1416;
        double r=(-1*pi*h+Math.sqrt(pi*pi*h*h+2*pi*a))/(2*pi);
        System.out.println(r);
        double area=(double)(2*pi*r*r)+2*pi*r*h;
        System.out.println("area="+area);
    }
}