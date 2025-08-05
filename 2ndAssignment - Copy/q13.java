import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the base of a triangle  in cm : ");
        int base= sc.nextInt();
        System.out.print("Enter the  area of a triangle  in cm: ");
        int area= sc.nextInt();
       

    int length =(area*2)/base;


    System.out.println("length="+length);
    }
}