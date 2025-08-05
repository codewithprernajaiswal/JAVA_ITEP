import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the array size=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter "+(i+1)+"element=");
            arr[i]=sc.nextInt();

        } 
        int temp=arr[n-1];
        arr[n-1]=arr[0];
        arr[0]=temp;
         System.out.println("Given Data..");
        for(int i=0; i<n; i++)
          System.out.print(arr[i]+" ");
        }
        
    }
