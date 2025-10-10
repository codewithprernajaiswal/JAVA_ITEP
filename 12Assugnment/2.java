//  2. InputMismatchException

// 👉 Ask the user to enter an integer. If the user enters text instead, catch the exception.

// // Expected
// Enter an integer: abc
// // java.util.InputMismatchException caught 2 
    import java.util.InputMismatchException;
import java.util.Scanner;
    class Test{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            try{
            System.out.println("enter the the integer =");
            int n=sc.nextInt();
            }catch(InputMismatchException e){
                System.out.println(e +" caught");
            }
        }
    }

