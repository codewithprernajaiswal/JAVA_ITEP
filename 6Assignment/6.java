// Q.6 Sort the array of 0s , 1s and 2s.di
class Test{
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String args[]){
        
        int arr[]={0,1,2,2,2,1,0,0,0};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==1&&arr[j]==0){
                    swap(arr,i,j);
                    
                }else if(arr[i]==2&&arr[j]==1){
                    swap(arr,i,j);
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}