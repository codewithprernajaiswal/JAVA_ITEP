import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length: ");
          int length = sc.nextInt(); 
        System.out.print("Enter the length: ");
          int width= sc.nextInt(); 
        // int length=30;
        // int width=20;
        int area =length*width;
        int path1=3;
        int path2=4;
        
       
        int patharea=(path1*length+path2*width)-(path1*path2);
        int use=area-patharea;
        System.out.println("usable area="+use);
    }
    }