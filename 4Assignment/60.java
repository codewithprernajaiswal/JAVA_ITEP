class Test{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int s=1;s<5-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                // if(i==j||j==1||i==5){
                //     System.out.print("X");
                // }

                System.out.print("*");
            }
          System.out.println();
        }
    }
}