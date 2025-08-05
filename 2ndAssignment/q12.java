import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the base of a triangle  in cm : ");
        int base= sc.nextInt();
        System.out.print("Enter the  height of a triangle  in cm: ");
        int hypt= sc.nextInt();

    double length =Math.sqrt(hypt*hypt-base*base);

    double area =0.5*(length*base);
    System.out.println("area="+area);
    System.out.println("length="+length);

    }

}