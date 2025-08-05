 import java.util.Scanner;
 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of path  : ");
          int length = sc.nextInt();
           System.out.print("Enter the breadth of path  : ");
          int breadth =sc.nextInt();
//  double length=120*100;
        // double breadth=2.4*100;
        double lenb=24.0;
        double breadthb=15.0;
        double brick=lenb*breadthb;
        double path=length*breadth;
        int n=(int)Math.ceil(path/brick);
        System.out.println("no of bricks="+n);
    }
 }