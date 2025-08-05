import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            for(int s=1;s<=5-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1||j==i||i==5)
                System.out.print("1");
             else
             System.out.print("*");
        }
        System.out.println();
        }
    }
}