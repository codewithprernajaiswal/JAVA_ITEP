class Test{
    public static void main(String args[]){
        for(int i=0;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i==5){
                  if(j%2==0){
                    System.out.print("0");
                  }else{
                    System.out.print("1");
                  }
                }else{
                    if(j==1||j==i){
                        if(j%2==0){
                            System.out.print("0");
                        }else{
                            System.out.print("1");
                        }
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}