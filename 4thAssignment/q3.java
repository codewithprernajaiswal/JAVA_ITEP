import java.util.Scanner;
class P3{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of term- ");
        int n = sc.nextInt();
        int i=1, a;
        while(i<=n){
            a=i*i;
            System.out.println(a);
            i++;
        }
    }
}