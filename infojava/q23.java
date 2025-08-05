class Q23{
    public static  void main(String args[])
    {
        int l=15,b=9,h=12,side=3;
        int vol_c=side*side*side;
        int vol_cuboid1=l*b*h;
        int total_vol=vol_cuboid1/vol_c;
        System.out.println("Number of cubical boxes"+total_vol);
    }
}