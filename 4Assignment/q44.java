import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number=");
        int n=sc.nextInt();
        int ld=n%10;
        while(n>1){
            n=n/10;

        }
        int fd=n;
        System.out.println("last digit ="+ld+"first digit ="+fd);
                int temp=ld;
        ld=fd;
        fd=temp;
        System.out.println("last digit ="+ld+"first digit ="+fd);

    }
}