class Program{
    public static void main(String args[]){
        int arr[][]={
            {10,20,30,},
            {40,50,60},
            {70,80,90}
        };
        int sumeven=0;
        int sumodd=0;
        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
            if(arr[r][c]%2==0){
                sumeven+=arr[r][c];
                // System.out.print(arr[r][c]+" ");
            }else{
                sumodd+=arr[r][c];
            }
            }        
            }
            System.out.println("oddd="+sumodd);
            System.out.println("even="+sumeven);
        
    }
}