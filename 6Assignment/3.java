// Q.3 Write a program to reverse the array.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the n size =");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter "+(i+1)+" xelement");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++){
            int temp=a[i];
            a[i]=a[arr.length-1-i];
            a[arr.length-1-i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println("enter "+(i+1)+" xelement");
            a[i]=sc.nextInt();
        }
    }
}