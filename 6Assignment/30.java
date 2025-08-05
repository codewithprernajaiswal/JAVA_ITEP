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

        //  A in ascending order
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        //  B in descending order
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (b[i] < b[j]) {
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }

        // Merge A and B into C
        int c[] = new int[m + n];
        for (int i = 0; i < m; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            c[m + i] = b[i];
        }

        // Find max and min
        int max = c[0];
        int min = c[0];
        for (int i = 1; i < c.length; i++) {
            if (c[i] > max) {
                max = c[i];
            }
            if (c[i] < min) {
                min = c[i];
            }
        }

        // Print C
        System.out.print("Merged Array C: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

        // System.out.println("\nMaximum value: " + max);
        // System.out.println("Minimum value: " + min);
    }
}

