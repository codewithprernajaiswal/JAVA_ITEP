class Test{
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            for(int s=0;s<i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<5-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}