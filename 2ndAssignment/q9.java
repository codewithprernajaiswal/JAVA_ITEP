import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the side in cm: ");
        int s = sc.nextInt();
// len=12.0;
       double area=(1.732/4)*s*s;
       System.out.println("area ="+area);      
    }
}