class Test{
    public static void main(String args[]){
        int n = 5;
        for(int i=0;i<5;i++){
            for(int s=1;s<=5-i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(n);
            }
            n--;
            System.out.println();
        }
    }
}