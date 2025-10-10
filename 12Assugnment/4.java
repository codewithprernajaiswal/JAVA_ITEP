
// 4. NullPointerException

// 👉 Declare a String = null. Try to call length() on it. Handle the exception.

// // Expected
// java.lang.NullPointerException caught
class Test{
    public static void main(String args[]){
        try{
        String s=null;
        System.out.println(s.length());
    }catch(NullPointerException e){
        System.out.println(e +"  caught");
    }
}


}
