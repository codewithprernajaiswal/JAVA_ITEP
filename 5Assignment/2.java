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

        System.out.println("Given Data..");
           int sumeven=0;
           int sumodd=0;       
        for(int i=0; i<n; i++){
            if(i%2==0)
          sumeven=sumeven+arr[i];
          else
          sumodd=sumodd+arr[i];
        }
         System.out.println("sumodd ="+sumeven+"even ="+sumodd);
    }
    }