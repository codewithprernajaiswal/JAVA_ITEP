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
    //   int a[i]=0;
      for(int i=0;i<a.length-1;i++){
        for(int j=i+1;j<a.length;j++){
            if(a[i]>a[j]){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
      }

      System.out.println("Given Data..");
        for(int i=0; i<n; i++)
          System.out.println(a[i]);
        

    }

}