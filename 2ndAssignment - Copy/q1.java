import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the area of the rectangle: ");
        int area = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();

        // Calculating length
        int length = area / breadth;
        System.out.println("Length is = " + length);

        // Calculating perimeter
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter is = " + perimeter);
    }
}
