import java.util.Scanner;
class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of brick: ");
          int l= sc.nextInt();
           System.out.print("Enter the breadth of brick: ");
          int b=sc.nextInt();
          System.out.print("Enter the height  of brick: ");
          int h=sc.nextInt();
        // double l=15;
        // double b=8;
        // double h=5;
        //double c=7;
        double brick=l*b*h;
        double wall=1500*1000*800;
        int n=(int)(wall/brick);
        System.out.println("nof bricks ="+n);
    }
}