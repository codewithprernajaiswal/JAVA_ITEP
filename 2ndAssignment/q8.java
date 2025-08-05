import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the triangle altitude  in cm: ");
        double h = sc.nextDouble();
         System.out.print("Enter the triangle area in msq: ");
         double area = sc.nextDouble();
// double  h=0.2;
//      double area=0.8;
     double b=(area*2)/h;
     System.out.println("base of triangle ="+b);
   }
   }