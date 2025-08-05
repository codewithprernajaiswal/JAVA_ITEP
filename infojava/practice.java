class Practice{
    public static void main(String args[]){
        // double d=30.5;
        float f=30.5f;
        

        // float area =0.5*2*4;error
        // practice.java:7: error: incompatible types: possible lossy conversion from double to float
        // float area =0.5*2*4;
        float area =0.5f*2*4;
       
       int x=1;
       float y=1.0f;
       System.out.println(x==y);//true
       double z=1.0;
       System.out.println(z==y);//true 
       int r='A'+'B';
       System.out.println(r);//131
    //    char c='A';
       char c1='B';
    //    System.out.println(c+c1);//131
       System.out.println('A'+'B');//131
    //    increment 
    int a,b ,c ,d ;
    a=5;
    b=6;
    c=10;
    d=8;
    a=++b;
    b=c++;
    c=a++;
    d=++b;
     System.out.println("a="+a+"b="+b+"c="+c+"d="+d);

     int a2=20;
     int b2=10;
    //  byte c2=a+b;//practice.java:37: error: incompatible types: possible lossy conversion from int to byte
    //  byte c2=a+b;
    byte a3=126;
    byte r2=(byte)(a3+4);
    System.out.println(r2);// output is =-126
    
    //byte x4=130;//practice.java:42: error: incompatible types: possible lossy conversion from int to byte
    //byte x4=130;
    // int x5=2147483648;//practice.java:45: error: integer number too large: 2147483648
    // long x6=2147483648;//practice.java:46: error: integer number too large: 2147483648
    // 
    // correct is //
    long x7=2147483648l;
    long x8=1l;
    System.out.println(7/2);//output is =3
    System.out.println(7%2);//=1
     System.out.println(-7%2);//=-1
     System.out.println(7%-2); //=1
    System.out.println(7.5%2);//=1.5
     System.out.println(3%7);//=3
    // System.out.println(7/0);  //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //at Practice.main(practice.java:57)
    System.out.println(7.5%0);//=NaN
    System.out.println(0%7);//=0
    int n1=123;
    System.out.println(n1%10);//=3
    System.out.println(n1/10);//=12
    


           }
}