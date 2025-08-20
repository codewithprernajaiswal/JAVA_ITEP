import java.util.Scanner;
// class Method{
//     public String uppercase(String a){
//         String s=new String();
//         for(int i=0;i<a.length();i++){
//             int ch=(int)a.charAt(i);
//             if(ch>=97&&ch<=122){
//                 ch=ch-32;
//             }
//             char c=(char)ch;
//             s=s+c;

//         }
        // return s;
        class Sequence{
    private String data;
    public Sequence(String data){
        this.data = data;
    }
          public String getUpperCase(){
       String result = ""; 
       char arr[] =  data.toCharArray();
       for(char element : arr){
          if(element >='a' && element <='z')
            element = (char)(element - 32);

          result  = result + element;  
       }
       return result;
    }
        
    }

class Test{
    public static void main(String args[]){
    // Method m=new Method();
    // Scanner sc=new Scanner(System.in);
    // System.out.println("enter the string ...");
    // String input=sc.nextLine();
    Sequence s = new Sequence("aaabbbacccababacccaabb");
    // System.out.println("upper case="+m.uppercase(input));
    // System.out.println("upper case="+m.getUpperCase(input));
     String result = s.getUpperCase();
      System.out.println(result);


    }
}