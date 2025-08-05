import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the side in cm: ");
        int s = sc.nextInt();
          
        //  s=15.0;
        double  area=0.5*(s*s);
        System.out.println("area="+area);
    }
}