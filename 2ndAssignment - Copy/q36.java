import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r= sc.nextDouble();
// double r=15.0/2;
        double h=7.0;
        double pi=3.1416;
    
        double surface =pi*r*(r+h);
        System.out.println("cylinder area="+surface);
    }
 }
