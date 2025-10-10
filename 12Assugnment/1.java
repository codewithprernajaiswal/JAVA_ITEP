// 1. Divide by Zero Exception

// 👉 Write a program that takes two numbers from the user and divides them. Handle the case where the second number is zero.

// // Expected
// Enter first number: 10
// Enter second number: 0
// java.lang.ArithmeticException caught: / by zero
import java.util.Scanner;
class Result{
    public static void result(double a,double b){
        try{
            if(b==0.0){
                throw new ArithmeticException("divide by zero is not allowed");
            }
            double res=a/b;
            System.out.println("result="+res);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first n-=");
        double  a=sc.nextDouble();
        // try{
        System.out.println("enter the 2nd number=");
        double  b=sc.nextDouble();
        // int c=a/b;
        // }catch(ArithmeticException e){
        //     System.out.println(e);
        // }
        Result.result(a,b);

    }
}