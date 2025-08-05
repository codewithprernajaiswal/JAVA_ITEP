import java.util.Scanner;
class Test{
    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number=");
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            
            for(int j=1;j<=i;j++){
                if(i%j == 0)
            System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}