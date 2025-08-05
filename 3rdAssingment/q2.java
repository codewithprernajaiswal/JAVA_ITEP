import java.util.Scanner;
class Assignment3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the quantity ");
        int n=sc.nextInt();
        int cost=n*100;
        // if(cost>=1000)
        // System.out.println("disount given ");
        double total;
        if(cost>=1000){
           total =(cost*10.9);
        }else{
             total=cost;
        }
        System.out.println("total cost to pay="+total);
    }
}