import java.util.Scanner;
class Test{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter Data size");
        int n = sc.nextInt();

         int arr[] = new int[n+1]; 
        
        for(int i=0; i<n; i++){
            System.out.println("Enter "+(i+1)+" element");
            arr[i] = sc.nextInt();
        }
        System.out.print("enter location =");
        int loc=sc.nextInt();
        System.out.println("enter the element=");
        int item=sc.nextInt();
        
        for(int i=n;i>loc;i--){
            arr[i]=arr[i-1];

        }

     arr[loc]=item;
     n++;
     for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
     }

    
    }

}