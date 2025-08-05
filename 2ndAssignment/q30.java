import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the tile length: ");
         int l= sc.nextInt(); 
          System.out.print("Enter the tile breath: ");
         int b= sc.nextInt(); 
         int area=l*b;
         System.out.print("Enter the rrom length: ");
         int rl= sc.nextInt(); 
          System.out.print("Enter the room breath: ");
         int rb= sc.nextInt(); 
         int roomarea=rl*rb;
         int n=(roomarea/area);
         System.out.println("no fo tile in room="+n);
    }
 }