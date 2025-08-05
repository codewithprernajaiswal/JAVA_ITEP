import java.util.Scanner;
class Assignment3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter single character =");
        String input = sc.nextLine(); 
        char ch=input.charAt(0);
        int num=(int)ch;
        if(num>=65 && num<=90){
            System.out.println("this is in upper case");
        }else if(num>=97 && num<=122){
            System.out.println("this is in loweer case");
            

        }else {
            System.out.println("enter the valid charachter");
        }
    }
}