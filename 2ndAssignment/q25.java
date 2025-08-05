  import java.util.Scanner;
 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of path  : ");
          int len= sc.nextInt();
           System.out.print("Enter the breadth of path  : ");
          int b =sc.nextInt();
// int len=24;
        // int b=15;
        int n=100;
        int  area=(len*b)*100;
        System.out.println("area of path ="+area);
    }
 }