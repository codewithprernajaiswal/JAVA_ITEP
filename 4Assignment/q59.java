import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        // System.out.println("");
        int sum=0;
        for(int i=100;i<=200;i++){
            if(i%9==0){
                sum=sum+i;
            }
        }System.out.println("sum of number are ="+sum);
    }
}

