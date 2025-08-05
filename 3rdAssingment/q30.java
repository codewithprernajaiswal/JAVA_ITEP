import java.util.Scanner;
class Assignment3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter year =");
        int year=sc.nextInt();
        if(year%4==0&&year){
            System.out.println("its leap year");

        }else if(year%400==0){
           System.out.println("its leap century"); 
        }
    }
}