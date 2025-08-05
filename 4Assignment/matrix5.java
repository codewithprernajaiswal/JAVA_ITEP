class Program{
    public static void main(String args[]){
        int arr[][]={
            {1,2,3,},
            {4,5,6},
            {7,8,9}
        };
       
        int maxrow=0;
        int maxsum=0;

        for(int r=0;r<3;r++){
            int sum=0;

            for(int c=0;c<3;c++){
             sum+=arr[r][c];
            System.out.println("row   "+r+" sum="+sum);
            }
            if(sum>maxsum){
                maxsum=sum;
                maxrow=r;
            }
            }   
            System.out.println("row  "+maxrow+" has max=  "+maxsum);    
            }
        
    }
