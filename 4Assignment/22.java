class Test{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i==5){
                    int a = 64 + j;
                    char ch = (char)(a);
                    System.out.print(ch);
                }else{
                    if(j==1||j==i){
                         int a = 64 + j;
                         char ch = (char)(a);
                        System.out.print(ch);
                    }else{
                        System.out.print(" ");
                    }
                }
            }System.out.println();
        }
    }
}