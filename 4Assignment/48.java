import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            char ch='A';

            for(int s=5;s>i;s--){
                System.out.print(" ");
            }for(int j=1;j<=i;j++){
                if(i==5||j==1||j==i){
                    System.out.print(ch);
                }else{
                    System.out.print("_");
                    
                }
                 ch++;
            }
          
        System.out.println();
        }
    }
}

