class Circle{
    private double radius;
    public void Circe(){

    }
    public void Circle(double radius){
       this.radius=radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void Area(){
        System.out.println("area of circle ="+3.14*radius*radius);
    }
    public void Circumference(){
        System.out.println("circumference of circle="+2*3.14*radius);
    }
}
class Test{
    public static void main(String args[]){
        Circle c=new Circle();
        
        c.setRadius(5);
        c.Area();
        c.Circumference();

    }
}