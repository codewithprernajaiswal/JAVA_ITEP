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
        int small=arr[0];
        int  largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }else{
                if(arr[i]>largest){
                    largest=arr[i];
                }
            }
        }    
      System.out.println("Given Data..");
        for(int i=0; i<n; i++)
          System.out.println(arr[i]);
        


      System.out.println("largest="+largest+"  smallest ="+small);  
        }
}