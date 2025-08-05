import java.util.Scanner;
class Test{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter number=");
    int num=sc.nextInt();
    int n=num;
    int r=0;
    int digit;
    while(n>0){
        digit=n%10;
        r=r*10+digit;
        n=n/10;
    }
    if(num==r){
        System.out.println("number is palidrome");
    }else{
        System.out.println("number is not palidrome");
    }
    }
}
