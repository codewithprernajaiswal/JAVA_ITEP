// 5) Write a java program to reverse each word of String.
// Sample Input: Java Is Plateform Independent
// Output: avaJ sI mrofetalP tnednepednI
import java.util.Scanner;

class Test{
    public static String Reverse(String str){
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s+=str.charAt(i);

        }
        return s;
        // System.out.println("new ="+s);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String =");
        String str1=sc.nextLine();
        // String s="";
        // for(int i=str.length()-1;i>=0;i--){
        //     s+=str.charAt(i);

        // }
        // System.out.println("new ="+s);

        String word="";
        String reverse="";
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=' '){
                word=word+str1.charAt(i);

            }
            else{
             reverse=reverse+Reverse(word)+" ";
             word="";
            }
        }
         reverse = reverse + Reverse(word);
        System.out.println("reverse string ="+reverse);
    }
}