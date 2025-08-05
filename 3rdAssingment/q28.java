import java.util.Scanner;

class Assignment3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the unit ");
        int unit=sc.nextInt();
        double totalunit;

        if(unit>=50){
        totalunit=unit*0.50;
        System.out.println("total bill="+totalunit);

        }else if((unit>50)&&(unit<150)){
            totalunit=unit*0.75;
             System.out.println("electricity bill.="+totalunit);
        }else if((unit>150)&&(unit<250)){
            totalunit=unit*1.20;
             System.out.println("electricity bill.="+totalunit);

        }else if(unit<=250){
        totalunit=unit*1.50;
        double bill=(totalunit*20)/100;
        double totalbill=totalunit+bill;
        System.out.println("electricitybill="+totalbill);
        }
        // System.out.println("electricity bill.="+totalunit);

    }
}
