import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the base1: ");
          int b1 = sc.nextInt(); 
        System.out.print("Enter the base1: ");
          int b2 = sc.nextInt();   
        System.out.print("Enter the height: ");
          int h = sc.nextInt(); 
         System.out.print("Enter the wide: ");
          int w= sc.nextInt(); 
          double area=0.5*(b1+b2)*h;
          double walkway=w*h;
          double woodarea=area-walkway;
          System.out.println("total area="+woodarea);
    }
 }
