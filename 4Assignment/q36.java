import java.util.Scanner;
class Test{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("enter number=");
     int num=sc.nextInt();
     int n=num;
     System.out.print("reverse digit= ");
     while(n!=0){
        int digit=n%10;
        n=n/10;
        System.out.print(digit);
     }
    }
}