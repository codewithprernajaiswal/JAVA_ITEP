import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length in m : ");
        int l= sc.nextInt();
        System.out.print("Enter the width in m: ");
        int w = sc.nextInt();
        int per=2*(l+w);
        int round=10*per;
        double  distance=round/1000;
        System.out.println("ron jog around a park th toal distance="+distance+"km");
    }
}