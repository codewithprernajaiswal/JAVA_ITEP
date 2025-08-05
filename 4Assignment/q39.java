import java.util.Scanner;

class T2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int s = 0;
        int n = num;

        while (n > 0) {
            int digit = n % 10;
            int f = 1;

            for (int i = 1; i <= digit; i++) {
                f = f * i;
            }

            s = s + f;
            n = n / 10;
        }

        if (s == num) {
            System.out.println(num + " is a Strong Number.");
        } else {
            System.out.println(num + " is NOT a Strong Number.");
        }

        
        
    }
}
