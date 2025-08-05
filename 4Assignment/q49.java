
import java.util.Scanner;
class Test{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    // System.out.print("enter the number=");
    // int num=sc.nextInt();
    System.out.print("enter the number=");
    int a=sc.nextInt();
    System.out.print("enter the number=");
    int b=sc.nextInt();
    for(int j=a;j<=b;j++){
    int sum=0;
    int num=j;
     for(int i=1;i<j;i++){
        if(j%i==0)
        sum=sum+i;

     }
           
    if(j==sum){
      
     System.out.println(j+"perfect number  number..");
    }else{
     System.out.println(j+"not perfect  number..");
     }
    }
    }
}