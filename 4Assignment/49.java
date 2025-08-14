class Test{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int s=1;s<=5-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
               if(j%2==1){

                System.out.print("1");
               }else{
                System.out.print("0");
               }
            }
            System.out.println();
        }
    }
}
