//    1 - 2 + 3 - 4 + 5 - 6 ....n (calculate sum)
import java.util.Scanner;
class Test {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int i=1;
        int sum = 0;
        if(n>0)
        while(i<=n){
            if (i%2!=0){
                sum = sum + i;
            }
            else {
                sum = sum - i; 
            }
            i++;
        }
        System.out.println(sum);
    }
}