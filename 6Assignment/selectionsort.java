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
        System.out.print("before sort=");
        for(int i=0; i<n; i++)
          System.out.print(arr[i]+" "); 

       for(int i=0;i<n;i++){
        int min=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min]){
            min=j;
            }
        }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        } 
        System.out.print("After sort=");
        for(int i=0; i<n; i++)
          System.out.print(arr[i]+" ");
        }
       }   