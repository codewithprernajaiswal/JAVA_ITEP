import java.util.Scanner;

class Test1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("                     D-mart Mall                       ");
        System.out.println("----------------------------------------------------");
        System.out.print("Name: ");
        String name=sc.next();
        

        System.out.print("Enter item 1: ");
        String item1=sc.next();
        System.out.print("Enter quantity: ");
        int qnt1=sc.nextInt();
        int rate1=10;

        System.out.print("Enter item 2: ");
        String item2=sc.next();
        System.out.print("Enter quantity: ");
        int qnt2=sc.nextInt();
        int rate2=20;

        System.out.print("Enter item 3: ");
        String item3=sc.next();
        System.out.print("Enter quantity: ");
        int qnt3=sc.nextInt();
        int rate3=30;

        System.out.print("Enter item 4: ");
        String item4=sc.next();
        System.out.print("Enter quantity: ");
        int qnt4=sc.nextInt();
        int rate4=40;

        System.out.print("Enter item 5: ");
        String item5=sc.next();
        System.out.print("Enter quantity: ");
        int qnt5=sc.nextInt();
        int rate5=50;

        System.out.print("Enter item 6: ");
        String item6 = sc.next();
        System.out.print("Enter quantity: ");
        int qnt6=sc.nextInt();
        int rate6=60;

        System.out.print("Enter item 7: ");
        String item7=sc.next();
        System.out.print("Enter quantity: ");
        int qnt7=sc.nextInt();
        int rate7=70;

        System.out.print("Enter item 8: ");
        String item8=sc.next();
        System.out.print("Enter quantity: ");
        int qnt8=sc.nextInt();
        int rate8=80;

        System.out.print("Enter item 9: ");
        String item9=sc.next();
        System.out.print("Enter quantity: ");
        int qnt9=sc.nextInt();
        int rate9 = 90;

        System.out.print("Enter item 10: ");
        String item10=sc.next();
        System.out.print("Enter quantity: ");
        int qnt10=sc.nextInt();
        int rate10=100;

        int  total=(rate1*qnt1)+(rate2*qnt2)+(rate3*qnt3)+(rate4*qnt4)+(rate5*qnt5)+(rate6*qnt6)+(rate7*qnt7)+(rate8*qnt8)+(rate9*qnt9)+(rate10*qnt10);            
        
        int Itemqnt=(qnt1+qnt2+qnt3+qnt4+qnt5+qnt6+qnt7+qnt8+qnt9+qnt10);

        String Items=(item1+"\n"+item2+"\n"+item3+"\n"+item4+"\n"+item5+"\n"+item6+"\n"+item7+"\n"+item8+"\n"+item9+"\n"+item10);
        
        
        System.out.println("                     D-mart                       ");
        System.out.print("Name: " + name);
        System.out.println("                                        Date:30/7/2025");
        System.out.println("----------------------------------------------------");
        //System.out.println("item Name    quantity  price   Total  After-Discount=" + Items + Itemqnt + total);
        System.out.println("item Name" + Items);
        System.out.println("Quantity" + Itemqnt);
        System.out.println("Total" + total);
        System.out.println("                      Thank You                     ");
        System.out.println("                     Visiting us                     ");
        System.out.println("                       D-mart                        ");
        System.out.println("----------------------------------------------------");
        //System.out.println("Total amount:           " + total);

    }
}

