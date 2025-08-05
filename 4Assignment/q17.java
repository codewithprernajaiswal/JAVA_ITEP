import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number=");
        int n=sc.nextInt();
        int i=0;
        int a=1;
        while(i<=n){
            a=a+i;
            System.out.print(a+" ");
            i++;
        }
    }
}