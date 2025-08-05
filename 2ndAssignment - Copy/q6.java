import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      System.out.print("Enter the side in cm: ");
        int s1 = sc.nextInt();  
      System.out.print("Enter the  other side in cm: ");
        int s2 = sc.nextInt(); 
       System.out.print("Enter the  perimetere  in cm: ");
        int p = sc.nextInt();      
        
         int  s3=p-(s1+s2);
        int s=p/2;
        double  d=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println("arae="+d);
    }
}
