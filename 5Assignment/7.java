import java.util.Scanner;
class P7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int temp=0;
        for(int i=0;i<size;i++){
            System.out.println("enter "+(i+1)+" element");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;}
            }
            System.out.println(arr[i]);
        }

        System.out.println("enter the element you want to search");
        int target=sc.nextInt();
        int middle=size/2;
        if(arr[middle]<target){
        for(int i=middle;i<=size;i++){
            if(arr[i]==target)
            System.out.println("element found "+arr[i]);
        }
        }
        else{
            for(int i=middle;i>=0;i--){
                if(arr[i]==target)
                System.out.println("element found "+arr[i]);
            }
        }
       
}
}