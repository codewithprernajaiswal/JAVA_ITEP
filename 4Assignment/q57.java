import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter one  number=");
        int a=sc.nextInt();
        System.out.println("enter 2nd number=");
        int b=sc.nextInt();

        
        for(int i=a;i<=b;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                c++; 
            }
            }
            
                if(c==2){
                 System.out.print(i+" "); 
            }
                  
          }
        }
    }
