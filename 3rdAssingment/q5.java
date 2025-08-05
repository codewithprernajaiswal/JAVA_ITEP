import java.util.Scanner;
class Assignment3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st person age =");
        int person1=sc.nextInt();
         System.out.print("enter 2nd person age =");
        int person2=sc.nextInt();
         System.out.print("enter 3rd person age =");
        int person3=sc.nextInt();
    //     if(person1>person2 && person1>person3){
    //         System.out.println("person1 is older ");
    //     }else if(person2>person1 && person2>person3){
    //         System.out.println("person2 is older ");
    //     }else if(person3>person1 && person3>person2 ){
    //         System.out.println("person3 is older ");
    //     }else 
    //     System.out.println("3 people are of same age ");
    // 
    int oldest=person1;
    if(person2>oldest){
    oldest=person2;
    }
    if(person3>oldest){
        oldest=person3;

    }
    System.out.println("oldest age ="+oldest);
    int youngest=person1;
     if(person2<youngest){
    youngest=person2;
    }
    if(person3<youngest){
        youngest=person3;

    }
    System.out.println("youngest age ="+youngest);
}
}

