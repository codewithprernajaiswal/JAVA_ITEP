import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the h1 of a triangle  in m : ");
        int h1= sc.nextInt();
        System.out.print("Enter the  h2 of a triangle  in m: ");
        int h2= sc.nextInt();
        System.out.print("Enter the  length  of a triangle  in m: ");
        int length= sc.nextInt();

    double areaoft1=0.5*h1*length;
    double areaoft2=0.5*h2*length;
    double totalarea=areaoft1+areaoft2;
    System.out.println("t1="+areaoft1);
    System.out.println("t2="+areaoft2);
    System.out.println("total="+totalarea);
}
}