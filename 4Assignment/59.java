class Test{
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            for(int s=1;s<5-i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                int a=65+j;
                char c=(char)(a);
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}