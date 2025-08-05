import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length: ");
          int poollength = sc.nextInt(); 
        System.out.print("Enter the side: ");
          int side= sc.nextInt(); 
        //  int side=150;
        // int poollength=25;
        int area =side*side;
        int poolarea=poollength*poollength;
        int garea=area-poolarea;
        System.out.println("area of garden="+garea);

    }
    }