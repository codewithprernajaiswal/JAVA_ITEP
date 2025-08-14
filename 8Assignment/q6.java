class Employee{
    private String name;
    private String jobtitle;
    private int salary;
    public void Employee(){

    }
    public void Employee(String name,String jobtitle, int salary){
        this.name=name;
        this.jobtitle=jobtitle;
        this.salary=salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setTitle(String jobtitle){
        this.jobtitle=jobtitle;
    }
    public String getTitle(){
        return jobtitle;
    }
    public void setSalary(int salary){
        this.salary=salary;

    }
    public int getSalary(){
        return salary;
    }
    public void increment(double percent) {
        if (percent > 0) {
            salary += salary * (percent / 100);
        }
    }
     public   void Display(){
        System.out.println("Name="+name);
        System.out.println("jobTitle="+jobtitle);
        System.out.println("salary="+salary);
    }

}
class Test{
    public static void main(String args[]){
    Employee emp=new Employee();
    emp.Employee("priya ","developer",40000);
    emp.Display();  
    emp.increment(10);
     System.out.println("After increment ......");
     
    emp.Display(); 
    }
}