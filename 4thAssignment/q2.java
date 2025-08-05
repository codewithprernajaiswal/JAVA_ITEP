import java.util.Scanner;
class P2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number : ");
       int  n=sc.nextInt();
       if (n>0){
       int i=1;
       while(i<=n){
        System.out.println(i);
        i++;
       }}
       else
       System.out.println("Invalid number.");
       
    }
}