import java.util.Scanner;
class Assignment3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("do you have reason (Y/N) =");
         String input = sc.nextLine(); 
        char medical=input.charAt(0);
        
        if(medical=='Y' || medical=='y'){
            System.out.println("you are  allowed to sit in exam");
        }else if(medical=='N' || medical=='n'){
            System.out.println("you are not allowed to sit in exam");
            

        }else {
            System.out.println("enter the valid charachter");
        }
    }
}