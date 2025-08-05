import java.util.Scanner;
class Test{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        
            int i=1;
            double sum=0;
            while(i<=n){
                sum= sum + (1.0/i);
                i++;
                 
            }
            System.out.println("\n Sum of  " +n + " number is "+sum);          
        }
    }