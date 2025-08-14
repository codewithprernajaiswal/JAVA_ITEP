import java.util.Scanner;
class Test{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter n =");
       int n=sc.nextInt(); 
        for(int i=1;i<=n;i++){
           for(int s=1;s<=n-i;s++){
            System.out.print(" ");
           }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
             System.out.println();
            }
           
             for(int r=n-1;r>=1;r--){
                for(int s=1;s<=n-r;s++){
                    System.out.print(" ");
                }
                    for(int j=1;j<=r;j++){
                        System.out.print(j);
                    } System.out.println();
                }
        }
    }