class Question21{
    public static void main(String args[]){
        double l=15;
        double b=8;
        double h=5;
        //double c=7;
        double brick=l*b*h;
        double wall=1500*1000*800;
        int n=(int)(wall/brick);
        System.out.println("nof bricks ="+n);
    }
}