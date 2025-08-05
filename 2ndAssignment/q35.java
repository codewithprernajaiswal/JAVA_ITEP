import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius: ");
         float r = sc.nextFloat(); 
//   double r=7.7;
System.out.print("Enter the height : ");
         float h= sc.nextFloat();
        // double h=12.0;
        double pi=3.1416;
    
        double surface =pi*r*(r+h);
        System.out.println("cylinder area="+surface);
    }
 }