import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n=");
        int n=sc.nextInt();
        int i=1;

        while(i<=10){
            int a=n*i;
            System.out.println(n +" * " + i +" = " + a);
            i++;
        }
    }
}