import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the plot length: ");
        int len = sc.nextInt();
        System.out.print("Enter the breadth of plot: ");
        int wide = sc.nextInt();
        int  area=len*wide;
       int  persquare=area/100;
        int  cost=6*persquare;
   System.out.println("area="+area);
   System.out.println("per sqauer="+persquare);
   System.out.println("cost=$"+cost);
    }
 }    
