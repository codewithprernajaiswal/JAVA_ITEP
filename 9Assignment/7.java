import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string ...");
        String str=sc.next();
        int occurence[]=new int[26];
        String newstr="";
         for(int i=0; i<str.length(); i++){
            int idx = str.charAt(i) - 97;
            if(occurence[idx] == 0){
                newstr += str.charAt(i);
                occurence[idx]++;
            }
            else occurence[idx]++;
        }
    
        System.out.println("new string is = "+ newstr);
    }
}