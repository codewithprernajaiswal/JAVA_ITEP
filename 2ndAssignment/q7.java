import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the triangle base is in  cm: ");
        int b= sc.nextInt();
        System.out.print("Enter the triangle area cm: ");
        int area= sc.nextInt();
        // int b=50,area=500;
        // area of traingle=(B*H)/2;
        int  h=(2*area)/b;
        System.out.println("The height of a triangle is "+h+"cm");
    }
}
