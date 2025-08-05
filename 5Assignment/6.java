import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Data size");
        int n = sc.nextInt();

        int a[] = new int[n]; 
        
        for(int i=0; i<n; i++){
            System.out.println("Enter "+(i+1)+" element");
        a[i] = sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                 int temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;

                }
            }
        }
        System.out.println("After sorting ");

    for(int i=0; i<n; i++)
          System.out.println(a[i]);
        
    }
}