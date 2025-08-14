class Test{
    public static void main(String args[]){
        for(int i=5;i>=1;i--){
            for(int s=1;s<=5-i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<=i-1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}