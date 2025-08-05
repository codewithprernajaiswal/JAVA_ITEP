//    1 2 3 .....n  (calculate sum)
import java.util.Scanner;
class P4{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        if (n>0){
            int i=1, sum=0;
            while(i<=n){
                System.out.print(i);
                sum=sum+i;
                i++;
            }
            System.out.println("\n Sum of  " +n + " natural number is - "+sum);}
            else
            System.out.println("Enter valid number");
        }
    }