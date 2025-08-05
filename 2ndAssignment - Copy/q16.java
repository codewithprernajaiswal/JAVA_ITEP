 import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length in m : ");
        int l= sc.nextInt();
        System.out.print("Enter the breadth in m: ");
        int b = sc.nextInt();
       
        int  a=b*l;
        System.out.println("area="+a);
    }
 }