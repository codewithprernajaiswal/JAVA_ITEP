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
        for(int i= 1;i<n;i++){
             for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
             }
        }
        System.out.print("after sort=");
        for(int i=0; i<n; i++)
          System.out.print(arr[i]+" ");
    }
}