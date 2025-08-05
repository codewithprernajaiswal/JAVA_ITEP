import java.util.Scanner;
class Assignment3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("entersservice year=");
        int year=sc.nextInt();
          System.out.print("enter salary=");
        int salary=sc.nextInt();
        if(year>5){
            // int bonus=salary*5/100;
            // int totalsalary=salary+bonus;
            double totalsalary=salary*1.05;//100%+5%=105%
            System.out.println("totalsalary given to emloyee="+totalsalary);

        }
    }
}k