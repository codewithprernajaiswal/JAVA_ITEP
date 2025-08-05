import java.util.Scanner;
class Test{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number=");
    int num=sc.nextInt();
    int count=0;
    int n=num;
           
    if(num==1){
     System.out.println("enter valid number..");
    }else{
     while (n != 0) {
    n= n/10;
    count++;
     }
        }  
        System.out.println("number of digits="+count);  
        }
}

