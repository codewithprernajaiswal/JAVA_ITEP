import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of crpet  : ");
          int longl  = sc.nextInt();
           System.out.print("Enter the wide of crpet  : ");
          int wide = sc.nextInt();  
        //  int long=5;
        // int wide=4;
        int persq=205;
        int cost=(longl*wide)*persq;
        System.out.println("cost="+cost);
       
    }
 }