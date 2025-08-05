class Test{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            int a = 1;
            for(int j=a;j<=i;j++){
                if(i==5){
                    int a = 96 + j;
                    char ch = (char)(a);
                    System.out.print(ch);
                }else{
                    if(j==1||j==i){
                         int a = 96 + j;
                         char ch = (char)(a);
                        System.out.print(ch);
                        a++;
                    }else{
                        System.out.print(" ");
                    }
                }
            }System.out.println();
        }
    }
}