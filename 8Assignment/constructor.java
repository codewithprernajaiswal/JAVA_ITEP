// class A{
//    public A(){
//     System.out.println("Default version...");
//    } 
//    public A(int x){
//      System.out.println("Int-version...");
//    }
//    public A(int x, int y){
//     System.out.println("Int-Int version...");
//    }
// }

// class TestMain{
//     public static void main(String args[]){
//         A obj = new A();
//         new A(100);
//         new A(20,10);
//     }
// }

class Test{
    public Test(int x, float y){
        this(x); // this-call
        System.out.println("Integer-Integer Version...");
    }
    public Test(int x){
        this();
        System.out.println("Integer Version...");
    }
    public Test(){
        System.out.println("Default Version");
    }
}
class TestMain{
    public static void main(String args[]){
        new Test(20,10);
    }
}