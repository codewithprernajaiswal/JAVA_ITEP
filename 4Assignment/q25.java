import java.util.Scanner;
// 11) WAP to print N odd numbers.
// 12) WAP to print Odd numbers upto N.

class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number=");
        int n=sc.nextInt();
        
        System.out.print("odd number are =");
        for(int i=1;i<=n;i++){
            if(i%2!=0){
               
            System.out.print(i*i*i+" ");            
            }
            
        }
    }
 }