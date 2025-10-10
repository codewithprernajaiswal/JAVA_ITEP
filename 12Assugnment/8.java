import java.util.Scanner;
import java.io.IOException;

 class Test {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n=");
    double n1=sc.nextDouble();   
     System.out.println("enter n=");
    double n2=sc.nextDouble();  
    try{
        if(n2==0.0){
            throw new ArithmeticException("division by zero is not allowed");

        }
        double res=n1/n2;
        System.out.println("result="+res);
        throw new IOException();

    }catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }catch(IOException e){
        e.printStackTrace();
    }    
         
    }
}
