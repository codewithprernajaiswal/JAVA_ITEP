class Test{
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            for(int s=0;s<5-i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                int a=65+j;
                char ch=(char)(a);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}