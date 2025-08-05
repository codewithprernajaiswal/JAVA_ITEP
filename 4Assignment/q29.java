import java.util.Scanner;
class Test{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        System.out.print("enter nth=");
        int n=sc.nextInt(); 
        double sum=0;
       int i=0;
    //    int n=6;
       double a=0;
       while(i<n){
        a=Math.pow(10,i)+a;
         
           System.out.println(a);

           i++;
           
       }
    
        
    }
}