import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array X  = ");
        int m = sc.nextInt();
        int x[] = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.print("Enter " + (i + 1) + " element of array X: ");
            x[i] = sc.nextInt();
        }

        System.out.print("Enter size of array Y= ");
        int n = sc.nextInt();
        int y[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " element of array Y: ");
            y[i] = sc.nextInt();
        }

        //  A in descending order
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (x[i] < x[j]) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }

        //  B in descending order
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (y[i] < y[j]) {
                    int temp = y[i];
                    y[i] = y[j];
                    y[j] = temp;
                }
            }
        }

        // Merge A and B into C
        int z[] = new int[m + n];
        for (int i = 0; i < m; i++) {
            z[i] = x[i];
        }
        for (int i = 0; i < n; i++) {
            z[m + i] = y[i];
        }
            
              for (int i = 0; i < z.length; i++) {
            for (int j = i + 1; j < z.length; j++) {
                if (z[i] < z[j]) {
                    int temp = z[i];
                    z[i] = z[j];
                    z[j] = temp;
                }
            }
        }
        
        // Print z
        System.out.print("Merged Array z: ");
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + " ");
        }
    }
        
}
