class Test{
    public static void main(String args[]){
        String s="prerna";
        int n= s.length();
        String [] arr = new String[n];
        for(int i=0;i<n-1;i++){
            s[i] = s[i]-32;
            arr = s[i];
        }
        System.out.print(arr);

        
    }
}