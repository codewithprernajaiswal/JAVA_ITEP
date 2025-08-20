// WAP to find word of maximum length in given String.
// 	Sample Input: Dear Student , You have need to work hard
// 	Output: Student
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter s string ...");
        String str=sc.nextLine();
        // int len=str.length();
        int maxlen=-1;
        String maxword="";
        String word="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
            word=word+str.charAt(i);
            }else{
                if(word.length()>maxlen){
                    maxword=word;
                    maxlen=word.length();

                }
                word="";
            }
        }
            if(word.length()>maxlen){
                maxword=word;
                maxlen=word.length();

            }
        System.out.println("maxword="+maxword+"maxlen="+maxlen);
        

    }
}