import java.util.Scanner;
class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of cube: ");
          int l= sc.nextInt();
           System.out.print("Enter the breadth of cube: ");
          int w=sc.nextInt();
          System.out.print("Enter the height  of cube: ");
          int d =sc.nextInt();
        // int l=50;
        // int w=30;
        // int d=2;
    int cap=l*w*d;
    System.out.println("cap="+cap+"cubemter");
    }
}