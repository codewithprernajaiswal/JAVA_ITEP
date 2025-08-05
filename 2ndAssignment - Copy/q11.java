import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // System.out.print("Enter the base of a triangle  in m : ");
        // int base= sc.nextInt();
        // System.out.print("Enter the  height of a triangle  in m: ");
        // int height= sc.nextInt();
       System.out.print("Enter the  area of a triangle  in m: ");
        int area= sc.nextInt();
      
      double x=Math.sqrt(320/20);
      double h=5*x;
      double b=8*x;
      System.out.println("x="+x +"b="+b +"h="+h);
       System.out.println("h="+h) ;
        System.out.println("b="+b);
    }
}