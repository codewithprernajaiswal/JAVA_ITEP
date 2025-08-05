class Employee{
    private int id;
    private String name;
    private int salary;

public void setId(int id){
    this.id=id;
}
public void setName(String name){
    this.name=name;
}
public void setSalary(int salary){
    this.salary=salary;
}
public void display(){
    System.out.println("Employee id="+id);
    System.out.println("Employee name="+name);
    System.out.println("Employee salary="+salary);
}

}

class Test{
    public static void main(String args[]){
        Employee emp=new Employee();
        emp.setId(1);
        emp.setName("priya");
        emp.setSalary(10000);
        emp.display();
    }
}

