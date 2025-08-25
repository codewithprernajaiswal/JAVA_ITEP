
import java.util.Scanner;
class Test1{
    public int  subArray(int num[],int target){
      
        int count=0;
    for(int i=0;i<num.length;i++){
        
        for(int j=i+1;j<num.length;j++){

           if(target==num[i]+num[j]){
           
            count++;
        
           }
        }

        }
        return count;
    }       
   
    }
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Test1 t=new Test1();
        System.out.println("enter size of array=");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the element in array...");
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        System.out.println("printing array....");
        for(int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
        }

        // int arr[]= {1,5,7,1};
        int result=t.subArray(arr,6);
        
        System.out.println("\n number of pair="+result);
    }
    }


