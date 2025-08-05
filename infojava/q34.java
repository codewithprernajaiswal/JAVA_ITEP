class Program34{
    public static void main(String args[]){
        double b1=148;
        double b2=92;
        double h=40;
        double a=0.5*(b1+b2)*h;
        double w=4;
        double ww=w*h;
        double wa=a-ww;
        System.out.println("total ="+wa);

        // q31
        int p=200;
        int sidel=p/4;
        int area =sidel*sidel;
        System.out.println("area of square="+area+"msq");

        // q32
        int side=150;
        int poollength=25;
        int area =side*side;
        int poolarea=poollength*poollength;
        int garea=area-poolarea;
        System.out.println("area of garden="+garea);


        // q33

        int length=30;
        int width=20;
        int area =length*width;
        int path1=3;
        int path2=4;
        
        int garea=area-poolarea;
        int patharea=(path1*length+path2*width)-(path1*path2);
        int use=garea-patharea;
        System.out.println("usable area="+use);



            }
}