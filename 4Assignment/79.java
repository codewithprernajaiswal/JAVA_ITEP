class Test{
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
          
            for(int j=1;j<=i;j++){
                if(j==1){
                    System.out.print("1");
                }else if(i==j){
                System.out.print(j);
                }else{
                System.out.print(" ");
            }
            }
             System.out.println();
            }
           
             for(int r=4-1;r>=1;r--){
                    for(int j=1;j<=r;j++){
                        if(j==1){
                            System.out.print("1");
                        }else if(r==j)
                        System.out.print(j);
                        else
                        System.out.print(" ");
                    } System.out.println();
                }
        }
    }