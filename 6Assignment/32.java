import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array A = ");
        int m = sc.nextInt();
        int a[] = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.print("Enter " + (i + 1) + " element of array A: ");
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of array B = ");
        int n = sc.nextInt();
        int b[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " element of array B: ");
            b[i] = sc.nextInt();
        }

        

        

        // Merge A and B into C
        int c[] = new int[m + n];
        for (int i = 0; i < m; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            c[m + i] = b[i];
        }

        

        // Print C
        System.out.print("Merged Array C: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

        
    }
}

