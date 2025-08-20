// WAP to count the word whose first letter is  vowel.
import java.util.Scanner;
class Test{
   
        public static Boolean vowel(char ch){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                return true;
            }
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string =");
        String str=sc.nextLine();
        int len = str.length();

        int wordCount = 0;

        //checking first word 
        if(isVowel(str.charAt(0))) wordCount++;
        
        //checking other words
        for(int i=1; i<len; i++){
            if(str.charAt(i-1)==' '){
                if(isVowel(str.charAt(i))) wordCount++;
            }
        }
        System.out.println("Number of words start with vowel are = "+ wordCount);
}
// class Test{

//     static void stratingWithVowel(String str){
//         char[] ch = str.toCharArray();
//         int n = ch.length;
//         int cnt = 0;

//         for(int i = 1; i < n; i++){
//             if(ch[i - 1] == 32 && ch[i] == 'A' || ch[i - 1] == 32 && ch[i] == 'E' || ch[i - 1] == 32 && ch[i] == 'I' || ch[i - 1] == 32 && ch[i] == 'O' || ch[i - 1] == 32 && ch[i] == 'U' || ch[i - 1] == 32 && ch[i] == 'a' || ch[i - 1] == 32 && ch[i] == 'e' || ch[i - 1] == 32 && ch[i] == 'i' || ch[i - 1] == 32 && ch[i] == 'o' || ch[i - 1] == 32 && ch[i] == 'u') cnt++;
//         }

//         if(ch[0] == 'A' || ch[0] == 'E' || ch[0] == 'I' || ch[0] == 'O' || ch[0] == 'U' ||
//             ch[0] == 'a' || ch[0] == 'e' || ch[0] == 'i' || ch[0] == 'o' || ch[0] == 'u'
//             ) cnt++;

//         System.out.println(cnt +" words starting with vowel.");
//     }

//     public static void main(String args[]){
//         String str = "aabbsdsds cddcddd eeef dmnkfir";
//         stratingWithVowel(str);
//     }
// }