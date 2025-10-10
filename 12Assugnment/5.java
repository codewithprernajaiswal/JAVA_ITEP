
// 5. Multiple Catch Blocks

// 👉 Take two integers and perform division. Handle both ArithmeticException and InputMismatchException separately.
 import java.util.InputMismatchException;
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("enter the first n=");
        int n1=sc.nextInt();
        System.out.println("enter the 2nd number=");
        int n2=sc.nextInt();
        int c=n1/n2;
    }catch(InputMismatchException e){
        System.out.println(e+" caught");

     }catch(ArithmeticException e){
        System.out.println(e+" caught");
     } 
    }
}