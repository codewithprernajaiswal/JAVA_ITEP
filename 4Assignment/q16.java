import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter nth=");
        int n=sc.nextInt();
        // int n=4;
        int r=0;
        int d=3;
        int res=0;
        int i = n;
        
        while(i>=0){
            res=-(d*i);
            
            System.out.println(res);
            i--;
        }
        i=1;
         while(i<=n){
            res=(d*i);
            System.out.println(res);
            i++;
         }
    }
}