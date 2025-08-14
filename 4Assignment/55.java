class Test{
    public static void main(String args[]){
        int n=5;
        for(int i=0;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<5-i;j++){
                int a=65+j;
                char c=(char)(a);
                System.out.print(c);
            }
            
            System.out.println();
        }
    }
}