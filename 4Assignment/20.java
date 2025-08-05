class Test{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i==5){
                    System.out.print(j);
                }else{
                    if(j==1||j==i){
                        System.out.print(j);
                    }else{
                        System.out.print(" ");
                    }
                }
            }System.out.println();
        }
    }
}