import java.util.Scanner;

class Assignment3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st angle: ");
        int angle1 = sc.nextInt();
        System.out.print("Enter the 2nd angle: ");
        int angle2 = sc.nextInt();
        System.out.print("Enter the 3rd angle: ");
        int angle3= sc.nextInt();
        int triangle=angle1+angle2+angle3;
        if(triangle==180){
            System.out.println("its triangle ");
        }
        else{
            System.out.println("its not triangle ");
        }

    }
}