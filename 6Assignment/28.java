import java.util.Scanner;
class Test{
    public static void main(String args[]){
        // int arr[] = {10,20,30,40,50,60,70,80,90};
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the n size =");
        int n=sc.nextInt();
        int p[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter "+(i+1)+" xelement");
            p[i]=sc.nextInt();
        }
        System.out.println("Enter element to be search");
        int element = sc.nextInt();
        int i;
        boolean status = false;
        for(i=0; i<p.length;i++){
            if(p[i] == element){
              status = true;
              break;
            }  
        }
        if(status)
         System.out.println("Element Found");
        else
         System.out.println("Element Not Found");        
    }
}