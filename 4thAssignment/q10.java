// 0	7	14	21	28	35	…..
import java.util.Scanner;
class P10{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms- ");
        int n=sc.nextInt();
        int term=0, i=1;
        if(n>0){
            while(i<=n){
                System.out.println(term);
                term=term+7;
                i++;
            }}
            else 
            System.out.println("Invalid Number.\n Try again!");
    }
}