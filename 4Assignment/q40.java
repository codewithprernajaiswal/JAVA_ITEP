import java.util.Scanner;
class Test{
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number=");
        int num=sc.nextInt();
        // int 
         int count=0;
         int n=num;
         int c=0;
        while(n!=0){
            int digit=n%10;
            if(digit%2==0){
                count++;
            }else{
                c++;
            }
             n=n/10;
        }

    
    System.out.println(" odd number of digits="+c);
    System.out.println(" even  number of digits="+count);
    
}
}