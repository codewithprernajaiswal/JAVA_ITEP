import java.util.Scanner;

class Assignment3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the price of  ");
        int price=sc.nextInt();
        int percent;
        int tax;

        if(price>100000){
            percent=(price*15)/100;
            tax=price+percent;
            System.out.println("tax t opaid ="+tax);
              
        }else if((price>50000)||(price<=100000)){
             percent=(price*10)/100;
            tax=price+percent;
            System.out.println("tax t opaid ="+tax);
        }else {
            percent=(price*5)/100;
            tax=price+percent;
            System.out.println("tax t opaid ="+tax);
        }

        // System.out.println("tax t opaid ="=+tax);
    }
}
