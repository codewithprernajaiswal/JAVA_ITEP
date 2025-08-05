import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number=");
        int n=sc.nextInt();
        int lastd=n%10;
        int firstd;
        while(n>1){
          n=n/10;

        }
        firstd=n;
        System.out.println("sum="+(lastd+firstd));

    }
}