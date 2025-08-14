class Person{
    private String name;
    private int age;
    
    public Person(String name,int age){
        this.name=name;
        this.age=age;

    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }        
    public   void  Display(){
        System.out.println("Name="+name);
        System.out.println("Age="+age);
      
    }
    
}
class Test{
    public static void main(String args[]){
        Person p1=new Person("priya",23);
        Person p2=new Person("aarav",20);
    

        p1.Display();
        p2.Display();

    }
}