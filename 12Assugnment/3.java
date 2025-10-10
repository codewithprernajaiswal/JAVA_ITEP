// 3. ArrayIndexOutOfBoundsException

// 👉 Create an array of size 5. Ask the user for an index and print the element. Handle the case when the index is out of range.

// // Expected
// Enter index: 8
// java.lang.ArrayIndexOutOfBoundsException caught
import java.util.Scanner;
class Test{
    public static void main(String[] args)
    {
          Scanner sc=new Scanner(System.in);
        
        int a[] = { 1, 2, 3, 4, 5 };

        try {
            // for (int i = 0; i <= a.length; i++)
            //     System.out.print(a[i] + " ");
             System.out.print("Enter index: ");
            int index = sc.nextInt();
            System.out.println("Element at index " + index + " = " + a[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e+"Caught");
        }
    }

}