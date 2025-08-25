class Test1{
    public int [] subArray(int num[],int target){
    for(int i=0;i<num.length;i++){
        int sum=0;
        for(int j=i;j<num.length;j++){
           sum=sum+num[j];
           if(target==sum){
            return new int[]{i,j};
           }if(sum>target){
            break;
           }
        }
    }       
    return new int[0];
    }
}
class Test{
    public static void main(String args[]){
        Test1 t=new Test1();
        int arr[]={1,2,3,4,5};
        int []result=t.subArray(arr,9);
        // System.out.println("result = " + Arrays.toString(result));
        if (result.length == 2) {
            System.out.println("result = [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No valid pair found.");
        }
    }
}