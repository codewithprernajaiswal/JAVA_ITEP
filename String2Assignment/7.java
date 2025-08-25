import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);      
        System.out.println("enter the string =");
        String str=sc.next();
        // String str="abc";
        char []arr1=str.toCharArray();
        System.out.println("enter the 2nd string =");
        String str2=sc.next();
        // String str2="def";
        char []arr2=str2.toCharArray();
        char arr3[]=new char[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[arr1.length+i]=arr2[i];
        }
        // for(int i=0;i<arr3.length;i++){
        //     System.out.print(arr3[i]);
        // }
        System.out.println("concate of string ="+new String(arr3));
    }
}