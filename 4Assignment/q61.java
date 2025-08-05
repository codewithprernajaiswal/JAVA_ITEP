
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st year=");
        int a=sc.nextInt();
        System.out.println("enter 2nd year=");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
         if(i%4==0){
            System.out.print(i+" ");

         }

        }
       
        }
    }
