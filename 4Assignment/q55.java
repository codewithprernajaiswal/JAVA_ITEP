import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number two =");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("odd number between "+a+"and "+b+"are =");
        for(int i=a;i<=b;i++){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
    }
}

