class Test{
    public static int  Fac(int n){
        if(n==0){
            return 1;
        }
        return n*Fac(n-1);
    }
    public static void main(String args[]){
        int result=Fac(5);
      System.out.print("factorail of ="+result);  
    }
}