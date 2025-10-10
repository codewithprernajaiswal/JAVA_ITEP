// 6. Finally Block Practice

// 👉 Open a Scanner, read an input, and always close the scanner in finally (show that finally always executes). 
    
import java.util.InputMismatchException;
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("enter the n=");
        int n=sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println(e+" caught");
        }
        finally{
            System.out.println("finally");
            sc.close();
        }

    }
}
