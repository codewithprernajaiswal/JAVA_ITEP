// 20)Create class Tile to store the edge length of a square tile , and create another class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.
import java.util.Scanner;
class Tile{
  private int edgelength;
  
 public Tile(int edgelength){
    this.edgelength=edgelength;
 } 
  public int areasquare(){
    return edgelength*edgelength;
  }

} 
class Floor{
    private int length;
    private int width;
     
    public Floor(int length,int width){
        this.length=length;
        this.width=width;
    } 
    public int area(){
        return length*width;
    }
    public double  totalTiles(Tile t){
       double f=area();
       double t2=t.areasquare();
       return f/t2;
  
   }

}
class Test{
    public static void main(String args[]){
        // 
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the tile length=");
        int t=sc.nextInt();
        System.out.println("enter the floor length=");
        int len=sc.nextInt();
        System.out.println("enter the floor width=");
        int wid=sc.nextInt();
        Tile tile=new Tile(t);
        Floor floor =new Floor(len,wid);
        double result=floor.totalTiles(tile);
        System.out.println("number of tile in floor="+result);
    }
}
