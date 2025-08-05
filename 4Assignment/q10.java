import java.util.Scanner;
// 9) WAP to print N even numbers.
// 10) WAP to print Even numbers upto N

class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number=");
        int n=sc.nextInt();
        int count=0;
        System.out.print("even number are =");
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
               
            System.out.print(i+" ");            
            }
            
        }
    }
 }