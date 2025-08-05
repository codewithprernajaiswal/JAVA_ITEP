//0 1 1 2 3 5 8 13 ..... n-Terms     
import java.util.Scanner;
class P7{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n, a=0, b=1, f, i=1;
        System.out.println("Enter number of terms- ");
        n= sc.nextInt();
        if (n>0){
            while (i<=n){
        System.out.println(a);
        f=a+b;
        a=b;
        b=f;
        i++;
         } }else
         System.out.println("Invalid Number");
}
}