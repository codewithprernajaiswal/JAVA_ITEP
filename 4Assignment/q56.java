import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two  number =");
        int a=sc.nextInt();
         int b=sc.nextInt();
        int f=1;
        System.out.print("factorial of number between "+a+" and "+b+" are =");
        for(int i=a;i<=b;i++){
            f=f*i;
            
        }
        System.out.println(f);
    }
}
// question 57

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number=");
        int a=sc.nextInt();
        int b=sc.nextInt();

        
        for(int i=a;i<=b;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                c++; 
            }
            }
            
                if(c==2){
                 System.out.print(i+" 
                 "); 
            }
                  
          }
        }
    }
