
// 2. Write a Java program to get the character at the given index within the String
import java.util.Scanner;
class Method{
    public char charAtindex(String str,int idx){
        char character[]=str.toCharArray();
        if(idx<=str.length())
        return character[idx];
        else
        return '0';
    }
}
class Test{
    public static void main(String args[]){
        // String str="abcde";
        // char []arr=str.toCharArray();
        // // System.out.println("enter the index =");
        // char target=arr[1];
        // char index=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==target){
        //          index=arr[i];
        //         break;
        //     }
        // }


        
        
        // System.out.println("index="+index);
        Scanner sc=new Scanner(System.in);
        Method m=new Method();
        System.out.println("enter string ...");
        String str=sc.next();
        System.out.println("enter index=");
        int index=sc.nextInt();
        System.out.println("character at index "+index+"is "+m.charAtindex(str,index));

    }
}