class Circle{
    private double radius;
        
     public void setRadius(double radius){
        this.radius=radius;
     }   
    public void area(){
       System.out.println("Area="+3.14*radius*radius); 

    }
    public void circumference(){
        System.out.println("Circumference="+2*3.14*radius);

    }

}
class Test{
    public static void main(String args[]){
        Circle c=new Circle();
        c.setRadius(5.0f);
        c. area();
        c.circumference();
    }
}