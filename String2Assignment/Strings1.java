class Msg{
    private String m1;
    public Msg(String m1){
        this.m1=m1;
    }
    public String toString(){
        return m1;
    }
}
class Test{
    public static void main(String args[]){
    String s1 = new String("ABC");
        StringBuffer sb1 = new StringBuffer("PQR");
        StringBuilder sbuild1 = new StringBuilder("XYZ");
        Msg obj = new Msg("Good Morning..");
        Msg obj2 = new Msg("Good Evening...");
        System.out.println(s1);
        System.out.println(sb1);
        System.out.println(sbuild1);
        System.out.println(obj);
        System.out.println(obj2);

    }
}