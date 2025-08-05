import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the 1st term: ");
        int t1= sc.nextInt();
        System.out.print("Enter the difference : ");
        int d = sc.nextInt();
       System.out.print("Enter the last term  : ");
        int term= sc.nextInt();
        
        int nthterm=t1+(term-1)*d;
        System.out.println("28="+nthterm); 
        // q45
        //  int t1=-21;
        // int d=3;
        // int term=28;
        // int nthterm=t1+(term-1)*d;
        int sum=(term/2)*(t1+nthterm);
        System.out.println("28="+sum);
    }
 }