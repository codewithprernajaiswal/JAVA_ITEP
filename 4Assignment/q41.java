// LCMs
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number=");
        int a=sc.nextInt();
        System.out.println("enter a number=");
        int b=sc.nextInt();
        int f=1;
        int i=2;
        while(i<a||i<b){
            if(a%i==0&&b%i==0){
                // Sysstem.out.println(f);
                f=i;
            }
            // System.out.println(f);
            i++;
        }
       System.out.println(f);
       int lcm=(a*b)/f;
        System.out.println(lcm);
    }
}