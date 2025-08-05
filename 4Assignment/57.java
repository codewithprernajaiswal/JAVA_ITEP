class Test{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int s=5;s>=5-i;s--){
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}