import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the perimeter: ");
          int p = sc.nextInt(); 
//    int p=200;
        int sidel=p/4;
        int area =sidel*sidel;
        System.out.println("area of square="+area+"msq");
    }
}