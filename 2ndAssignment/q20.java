import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length in cm : ");
        int length= sc.nextInt();
        System.out.print("Enter the breadth in cm: ");
        int width = sc.nextInt();
        System.out.print("Enter the height in cm: ");
        int h = sc.nextInt();
        // int length=25;
        // int width=10;
        // int h=8;
        int volume=length*width*h;
        System.out.println("volume of brcik of ice cream "+volume);
    }
}