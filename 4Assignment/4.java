import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number=");
        int n=sc.nextInt();
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
             System.out.print("*");   
            }
            System.out.println("*");
        }
    }
}