import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      System.out.print("Enter the cost : ");
        int cost= sc.nextInt();  
      System.out.print("Enter the  other length  in m: ");
        int l= sc.nextInt(); 
       System.out.print("Enter the  rate of per msq: ");
        int rate = sc.nextInt();  
     
        // int cost=1600,rate=25,l=20;
        int area=cost/rate;
        int b=area/l;
        int perimeter=2*(l+b);

        System.out.println("The area is "+area+" square cm");
        System.out.println("The breadth of rectangle is "+b+" cm");
        System.out.println("The perimeter of a rectangle is "+perimeter+" cm");
    }
    
}