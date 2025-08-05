import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           System.out.print("enter number=");
           int a=sc.nextInt();
           System.out.print("enter number=");
           int b=sc.nextInt();
           for(int i=a;i<=b;i++){
           int count=0;
           int n=i;
           
           if(i==1){
            System.out.println("enter valid number..");
           }else{
            while (n != 0) {
                n/= 10;
                count++;
            }
        }
         int sum = 0;
       int  temp = i;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }
        
    
        if (sum == i) {
            System.out.println( i+" number is an Armstrong number.");
        } else {
            System.out.println(i+" number  is not an Armstrong number.");
        } 
    }
           }

        }

    