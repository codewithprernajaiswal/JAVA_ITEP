import java.util.Scanner;
class Assignment3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no=");
        int num=sc.nextInt();
        if(num>0){
        System.out.println("Absolute value: " + num); 
        }else if(num<0){
        int absolute = Math.abs(num);
        System.out.println("Absolute value: " + absolute); 
        }else{
         System.out.println("number is zero");   
        }
    }
}

         