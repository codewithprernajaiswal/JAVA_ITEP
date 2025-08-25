class Test{
    public static void main(String argsp[]){
        int arr[]={-1, 2, -1, 3, 2};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    // 
                    break;
                }
                // System.out.println(arr[i]);
            }
            System.out.println(arr[i]);
        }
    }
}