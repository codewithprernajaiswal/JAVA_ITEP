import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Data size");
        int n = sc.nextInt();

        int arr[] = new int[n]; 
       
        for(int i=0; i<n; i++){
            System.out.println("Enter "+(i+1)+" element");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element which you want to search =");
        int n1=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==n1){
                System.out.println(" number "+arr[i]+" found at index ="+i);
            
            }//  }else{
            //     System.out.println(" number not found ......");
            //  }
            
        }

    }
}