import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n=");
        int n=sc.nextInt();
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
            
        }
        System.out.println(f);
    }
}