import java.util.Scanner;

class Assignment3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the  percent=");
        int percent=sc.nextInt();
        

        if(percent>90){
            
            System.out.println("grade A");
              
        }else if((percent>80)||(percent<=90)){
            
            System.out.println("grade B");
              
        }else if((percent>60)||(percent<=80)){
            
            System.out.println("grade C");
              
        }else{

        System.out.println("grade D");
              
    }
}
}