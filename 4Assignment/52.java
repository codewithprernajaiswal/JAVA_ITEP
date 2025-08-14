class Test{
    public static void main(String args[]){
        int n=5;
        for(int i=0;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5-i;j++){
                if(i==0||j==1||j==5-i){
                System.out.print(j);
                // else if(j==1||j==5-i){
                //     System.out.print(j);
                }else{
                    System.out.print("_");
                }
            }
            
            System.out.println();
        }
    }
}