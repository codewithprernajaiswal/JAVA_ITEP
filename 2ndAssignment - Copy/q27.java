import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of rrom  : ");
          int length = sc.nextInt();
           System.out.print("Enter the breadth of croom  : ");
          int breadth =sc.nextInt(); 
//  int length=20;
        // int breadth=15;
        int persq=5;
        int cost=(length*breadth)*persq;
        System.out.println("cost="+cost);
    }
 }