
// 18. Write a java program to get the length of a given string
class Test1{
    private String data;
    public Test1(String data){
    this.data=data;
    }
    public int getLength(){
        int count=0;
        char arr[]=data.toCharArray();
        for(char element:arr){
            count++;
        }
        return count++;
    }
}
class Test{
    public static void main(String args[]){
        Test1 t=new Test1("hello");
        int res=t.getLength();
        System.out.println("length="+res);
    }
}