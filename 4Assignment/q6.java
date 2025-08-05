import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number=");
        int n=sc.nextInt();
        System.out.print("Factor's are=");
        for(int i=1;i<=n;i++){

            if(n%i==0){
                System.out.print( i +" ");
            }
        }
    }
}