import java.util.Scanner;
class Assignment3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the 4 digit number=");
        int num=sc.nextInt();
        if(num>=1000 && num<=9999){
            int reverse=0;
            while (num>0){
                int digit=num%10;
                reverse=reverse*10+digit;
                num=num/10;
            //      int d1 = num % 10;           // Last digit
            // int d2 = (num / 10) % 10;    // Second last
            // int d3 = (num / 100) % 10;   // Third digit
            // int d4 = num / 1000;         // First digit
        //    int reversed = d1 * 1000 + d2 * 100 + d3 * 10 + d4;

            

            }
            System.out.println("reverse number ="+reverse);

        }else{
            System.out.println("invalild input=");

        }
    }
}