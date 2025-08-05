import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the n size =");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter "+(i+1)+" xelement");
            a[i]=sc.nextInt();
        }
 
      for(int i=0;i<n/2;i++){
        
                int t=a[i];
                a[i]=a[a.length-1-i];
                a[a.length-1-i]=t;
        }
      

      System.out.println("reverse Data..");
        for(int i=0; i<n; i++)
          System.out.println(a[i]);
        

    }
}