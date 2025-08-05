class Program6{
    public static void main(String args[]){
        double a,b,c,p;
        a=10;
        b=9;
        p=36;
        c=p-(a+b);
        double s=p/2;
        double d=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("arae="+d);
    }
}