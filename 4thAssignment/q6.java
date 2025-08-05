// 2 4 6 8 ........n-Terms
import java.util.Scanner;
class P6{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter number of terms- ");
        int n= sc.nextInt();
        if (n>0){
            int i=2;
        while(i<=n){
         System.out.println(i);
          i=i+2;
        } }
        else
        System.out.println("Enter valid number");
    }
}