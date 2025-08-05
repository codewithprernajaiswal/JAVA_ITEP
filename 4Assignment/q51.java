import java.util.Scanner;
class Test{
    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number=");
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            

     int n=i;
     System.out.print(i+" reverse digit= ");
     while(n!=0){
        int digit=n%10;
        n=n/10;
        System.out.print(digit);
     }
     System.out.println();
    }
}
                   

    }
