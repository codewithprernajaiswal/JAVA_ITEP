class Test{
    public static void main(String args[]){
        for(int i=1;i<5;i++){
            for(int s=1;s<5-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=9;j++){
                if(i==j||i==5){
                    System.out.print("1");

                }else{
                    if(j%2==0){
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}