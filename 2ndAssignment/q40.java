import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the height : ");
        int h= sc.nextInt();
    
    int  r=5;
    
    double pi=3.1416;
    double a=pi*r*r*h;
    System.out.println("volume  ="+a);
    }
}