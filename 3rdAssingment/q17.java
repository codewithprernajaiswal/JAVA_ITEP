import java.util.Scanner;

class Assignment3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the NUMBER ");
        int num=sc.nextInt();
        if(num<0)
        System.out.println("its negative number ");
        else if(num>=0)
        System.out.println("its a positive number");
       
        
    }
}