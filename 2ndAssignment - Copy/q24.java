 import java.util.Scanner;
 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of brick : ");
          double len= sc.nextDouble();
           System.out.print("Enter the breadth of brick : ");
          double b =sc.nextDouble();
          System.out.print("Enter the breadth of brick : ");
          double bh1=sc.nextDouble();
        double bl=len/10;
        double bw=b/10;

         double bh=bh1/10;
         System.out.print("Enter the length of wall: ");
          double walll= sc.nextDouble();
           System.out.print("Enter the breadth of wall: ");
          double wallh =sc.nextDouble();
          System.out.print("Enter the thickness of wall : ");
          double  waalt =sc.nextDouble();

          double walll=20.0;
    
           double wallh=2.0;
        
            double wallt=0.75;

             double bv=bl*bw*bh;

              double wv=walll*wallh*wallt;
              int n=(int)(wv/bv);
              double cp=900;
              double cost=(cp/100)*n;
              System.out.println("noofbrcik="+n);
              System.out.println("totalcost="+cost);
    }
}