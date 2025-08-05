class Rectangle{
    private int length;
    private int width;

    public void setLength(int length){
        this.length=length;
    }
     public void setWidth(int width){
        this.width=width;
    }
    public void area(){
        
        System.out.println("area dof rectangle ="+length*width);
    }
}
class Test{
    public static void main(String args[]){
        Rectangle r=new Rectangle();
        r.setLength(5);
        r.setWidth(4);
        r.area();
    }
}