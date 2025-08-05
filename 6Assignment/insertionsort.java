import java.util.Scanner;
class Test{
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of n=");
        int n=sc.nextInt();
         int arr[] = new int[n]; 
        
        for(int i1=0; i1<n; i1++){
            System.out.println("Enter "+(i1+1)+" element");
            arr[i1] = sc.nextInt();
        }
        int temp;
        int i;
        int j;
for(i=1;i<n;i++){
    temp=arr[i];
    j=i-1;
    while(j>=0&&arr[j]>temp){
        arr[j+1]=arr[j];
        j=j-1;

    }
    arr[j+1]=temp;
}
System.out.println("after sorting =");
for(int i1=0; i1<n; i1++)
          System.out.print(arr[i1]+" ");
    }
}