import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the side of tile  : ");
          int side = sc.nextInt(); 
    // //    q29
    int floor=800*900;
    int onetile=side*side;
    int no=floor/onetile;
    System.out.println("no of tile that required at floor ="+no);
    }
 }