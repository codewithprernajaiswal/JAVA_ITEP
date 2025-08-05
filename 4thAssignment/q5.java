// 1 3 5 7 9 .....n-Terms
import java.util.Scanner;
class P5{
public static void main(String[]args){
Scanner sc= new Scanner (System.in);
System.out.println("Enter number of terms- ");
int n= sc.nextInt();
if(n>0){
    int i=1;
    while(i<=n){
        System.out.println(i);
        i=i+2;
    }}
    else 
    System.out.println("Enter valid number of terms- ");
}
}