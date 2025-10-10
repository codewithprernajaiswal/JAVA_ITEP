// package wrpperclass;

 class Test {
    public static void main(String args[]){
        String s="hello 1 world 2 welcome 3 ";
         int sum=0;
        String[] chr = s.trim().split(" ");
        for (String number : chr) {
            try{
            sum += Integer.parseInt(number);
        }
    }catch(NumberFormatException e){}
        System.out.println("sum=" + sum);

    } 
    
}
