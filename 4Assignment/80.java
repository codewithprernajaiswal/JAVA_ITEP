class Test{
    public static void main(String args[]){
        int n=7;
        if(n%2==0){
            n=n/2;

        }else{
            n=(n+1)/2;
        }
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j%2==0){
                System.out.print("_");
                }
                else{
                System.out.print("*");
            }
            }
          System.out.println();
        }
        // reverse
         for(int i=n-1;i>=1;i--){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j%2==0){
                System.out.print("_");
                }else{
                System.out.print("*");
            }
            }
            System.out.println();
        }
    }
}