
import java.util.Scanner;
class Test{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number=");
    int num=sc.nextInt();
    int sum=0;
     for(int i=1;i<num;i++){
        if(num%i==0)
        sum=sum+i;

     }
           
    if(num==sum){
     System.out.println("perfect number  number..");
    }else{
     System.out.println("not perfect  number..");
     }
    }
}