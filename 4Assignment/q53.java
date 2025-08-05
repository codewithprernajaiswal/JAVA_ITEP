
import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
          System.out.println("enter number two =");
        int a=sc.nextInt();
        int b=sc.nextInt();
        // System.out.print("Enter the number: ");
        // int num = sc.nextInt();
        for(int j=a;j<=b;j++){
        int s = 0; 
        int n = j;

        while (n > 0) {
            int digit = n % 10;
            int f = 1;

            for (int i = 1; i <= digit; i++) {
                f = f * i;
            }

            s = s + f;
            n = n / 10;
        }

        if (s == j) {
            System.out.println(j + " is a Strong Number.");
        } else {
            System.out.println(j+ " is NOT a Strong Number.");
        }
       
        }
        
        
    }
}
