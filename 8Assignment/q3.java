class Rectangle{
private int length;
private int width;
public Rectangle(){

}
public Rectangle(int length,int width){
    this.length=length;
    this.width=width;
}
public void setLength(int length){
    this.length=length;
}
public int  getLength(){
        return length;
    }
public void setWidth(int width){
    this.width=width;
}    
public int getWidth(){
        return width;
    }
    public void Area(){
        
        System.out.println("area dof rectangle ="+length*width);
    } 
    public void Perimeter(){
        System.out.println("aperimeter of rectangle ="+2*(length+width));
    }
    
}
class Test{
    public static void main(String args[]){
        Rectangle r=new Rectangle();
        r.setLength(10);
        r.setWidth(5);
        r.Area();
        r.Perimeter();
    }
}

