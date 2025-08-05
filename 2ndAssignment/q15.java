import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length in m : ");
        int l= sc.nextInt();
         System.out.print("Enter the breadth in m: ");
        int b= sc.nextInt();
         System.out.print("Enter the side in m: ");
        int s= sc.nextInt();
        // double length =22;
        // double b=15;
        // double s=21;
        int areaofshelly=l*b;
        int areaof=s*s;

        System.out.println("shelly="+areaofshelly +"m rachel="+areaof+"m");
        if(areaof>=areaofshelly){
        int difference=areaof-areaofshelly;
        System.out.println("rachel garden is "+difference +" m than shelly");
        }
        else{
        int  difference= areaofshelly-areaof;
        System.out.println("shelly garden is "+difference +" meter than rachel");
        }

    


    } 
}