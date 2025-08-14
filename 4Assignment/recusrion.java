class Recursion{
    public static void Print(int n){
        if(n>10){
            return;
        }
        System.out.println(n);
        Print(n+1);
    }
// }
// class Test{
public static void main(String []args){
    Recursion r=new Recursion();
    r.Print(1);
}
}
// }