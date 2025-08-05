import java.util.Scanner;
class Test{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    // System.out.print("enter number=");
    // int num=sc.nextInt();
     System.out.print("enter 3 digit number=");
    int a=sc.nextInt();
     System.out.print("enter enter 3 number=");
    int b=sc.nextInt();
  

    for(int i=a;i<=b;i++){

    
    int n=i;
    int r=0;
    int num=n;
    // int digit;
    
    while(n>0){
        int digit=n%10;
        r=r*10+digit;
        n=n/10;
    }
     
    if(num==r){
        System.out.println(num+" number is palidrome");
    }else{
        System.out.println(num+" number is not palidrome");
    }
         }
    }
}