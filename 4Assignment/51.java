class Test{
    public static void main(String args[]){
        int n=5;
        for(int i=n;i>0;i--){
            for(int j=0;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            
            System.out.println();
        }
    }
}