import java.util.Scanner;
class Assignment3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number (1-7)=");
        int num=sc.nextInt();
        switch(num) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("thursday");
        break;
    case 5:
        System.out.println("friday");
        break;
    case 6:
        System.out.println("saturday");
    case 7:
        System.out.println("sunday");
    default:
        System.out.println("Other day");
}
    }
}