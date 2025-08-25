import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ..");
        String str=sc.next();
        int i;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)>=48 && str.charAt(i) <= 57)continue;
            else break;
        }
        if(i<str.length())System.out.println("String contain digit element...");
     else System.out.println("String contain only character element...");
     

        
    }
}