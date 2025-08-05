import java.util.Scanner;


class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number=");
        int n=sc.nextInt();
        int count=0;
        System.out.print("even number are =");
        for(int i=0;i<=n;i++){
            if(i%2==0){
               
            System.out.print(" * ");            
            }else if(i%2==1){
               
            System.out.print(" # ");            
            }else{
             System.out.print("*#");
        }
        }
    }
 }
