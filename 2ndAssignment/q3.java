import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

     System.out.print("Enter the tilelength: ");
     int tilelength = sc.nextInt();
    System.out.print("Enter the breadth of tile: ");
    int tbreadth = sc.nextInt();
    int areaoftile=tilelength*tbreadth;
    System.out.print("Enter the flooorlength: ");
     int length = sc.nextInt();
    System.out.print("Enter the breadth of floor: ");
    int breadth = sc.nextInt();
    int areaoffloor=length*breadth;
     System.out.println("area of flor="+areaoffloor);
     System.out.println("areaoftile="+areaoftile);
     int tiles=areaoffloor/areaoftile;
     System.out.println("no of tile="+tiles);
    }

 }   