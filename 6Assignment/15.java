class Test{
    public static void main(String args[]){
        int arr[]={1,0,0,1,0,1,1};
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==0){
                    sum=sum-1;
                }else{
                    sum=sum+1;

                }
                if(sum==0){
                    count++;
                    System.out.println(i+" "+j);
                }
            }
            // System.out.println(count);
        }
         System.out.println(count);
    }
}