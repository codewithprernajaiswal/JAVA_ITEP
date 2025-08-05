import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n=");
        int n=sc.nextInt();
        int s=0,c;
        double r;
        // System.out.print("square=");
        for(int i=1;i<=n;i++){
            s=i*i;
             c=i*i*i;
             r=Math.sqrt(i);
             System.out.println("square of "+ i+"="+s);
              System.out.println("cube of "+i +"="+c);
               System.out.println("root of "+i+"="+r);

        }
        // System.out.println("square="+s);

    }
}