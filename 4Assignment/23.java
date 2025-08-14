class Test{
    public static void main(String args[]){
         char ch='a';
        for(int i=1;i<=5;i++){
         
            for(int j=1;j<=i;j++){
                if(i==5||j==1||j==i){
             System.out.print(ch);
                }else{
                    System.out.print(" ");
                }
                        ch++;
                    
                }System.out.println();
            }
        }
    }



  