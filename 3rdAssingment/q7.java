import java.util.Scanner;
class Assignment3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter Number of classes held =");
        int classes=sc.nextInt();
        System.out.print("enter Number of classes attendence =");
        int attendence=sc.nextInt();
        double  percent=((double)attendence/ classes)*100;
        System.out.println("percentage of attendence ="+percent);
        if(percent<=75){
            System.out.println("student is not allowed to sit in exam . ");

        }else{
            System.out.println("student is allowed to sit in exam .");

        }
    }
}

        