import java.util.Scanner;
class Assignment3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st Number  =");
        int num1=sc.nextInt();
        System.out.print("enter 2nd Number =");
        int num2=sc.nextInt();
        System.out.print("enter 3rdd Number =");
        int num3=sc.nextInt();
        if(num1>num2 &&num1>num3){
            System.out.println("numver 1 is greater than number2 and number3");

        }else if(num2>num1 && num2>num3){
            System.out.println("numver 2is greater than number1 and number 3");
            
        }else if(num3>num1 && num3>num2){
             System.out.println("numver 3 is greater than number1 and number 2");
        }else 
        System.out.println("All three numberr is equal");
    }
}