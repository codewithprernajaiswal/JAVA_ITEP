class Test{
    public static void main(String args[]){
        int arr[] = {5,4};
        int peak = 0;
        boolean flage = false;
        for(int i = 0 ; i<arr.length-1; i++){
            if(flage){
              break;  
            }
            for(int j = i+1; j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    i = i+1;
                    continue;
                }
                if(arr[i]>arr[j]){
                    peak = i;
                    flage = true;
                    break;
                }else{
                    peak = j;
                    flage = true;
                    break;
                }
            }
        }
        System.out.println(peak);
    }
}