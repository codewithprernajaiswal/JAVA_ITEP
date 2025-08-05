 import java.util.Scanner;
 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of cartoon: ");
          int l= sc.nextInt();
           System.out.print("Enter the breadth of cartoon : ");
          int b =sc.nextInt();
          System.out.print("Enter the height  of cartoon : ");
          int h =sc.nextInt();
// int len=24;
        // int l=15,b=9,h=12,
        int side=3;
        int vol_c=side*side*side;
        int vol_cuboid1=l*b*h;
        int total_vol=vol_cuboid1/vol_c;
        System.out.println("Number of cubical boxes"+total_vol);
    }
}