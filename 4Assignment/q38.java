import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.print("enter number=");
           int num=sc.nextInt();
           
           int count=0;
           int n=num;
           
           if(num==1){
            System.out.println("enter valid number..");
           }else{
            while (n != 0) {
                n/= 10;
                count++;
            }
        }
         int sum = 0;
       int  temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }
        
    
        if (sum == num) {
            System.out.println( " number is an Armstrong number.");
        } else {
            System.out.println(" number  is not an Armstrong number.");
        } 
           }

        }

    