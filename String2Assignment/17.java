// 17. Write a Java program to convert all the characters in a string to Uppercas
import java.util.Scanner;
class Test1{
    private String data;
    public Test1(String data){
        this.data=data;
    }
    public String getUUppercase(){
        String result="";
        char arr[]=data.toCharArray();
        for(char element:arr){
            if(element>='a'&& element<='z'){
                element=(char)(element-32);
                result=result+element;
            }
        }
        return result;
    }
}
class Test{
    public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   Test1 t=new Test1("hello");
   String result=t.getUUppercase();
   System.out.println("result="+result);
    
    }
}