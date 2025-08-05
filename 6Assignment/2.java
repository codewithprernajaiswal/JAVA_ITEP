import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
;
        System.out.println("Enter Data size");
        int n = sc.nextInt();

        int arr[] = new int[n]; 
        
        for(int i=0; i<n; i++){
            System.out.println("Enter "+(i+1)+" element");
            arr[i] = sc.nextInt();
        }

          int max=arr[0];
          int min=arr[0];
          for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }else
            if(arr[i]<min){
                min=arr[i];
            }
          }
        System.out.println("Given Data..");
        for(int i=0; i<n; i++)
          System.out.println(arr[i]);
        

        System.out.println("max="+max+"   min ="+min);
    }
}


