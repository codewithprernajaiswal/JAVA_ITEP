import java.util.Scanner;
class Assignment3{
    // q4
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
         System.out.print("enter the 1st number =");
        int num1 =sc.nextInt();
        System.out.print("enter the 2nd number =");
        int num2 =sc.nextInt();
        if(num1==num2){
            System.out.println("enter different number ");

        }else {
            num1=num1+num2;
            num2=num1-num2;
            num1=num1-num2;
            System.out.println("number 1="+num1+"number 2 ="+num2);

        }
    }