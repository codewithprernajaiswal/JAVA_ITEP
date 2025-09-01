import java.util.Scanner;
abstract class Employee{
 private int id;
 private String name;
 private  int salary;
 public Employee(int id,String name){
    this.id=id;
    this.name=name;
    // this.salary=salary;

 }
 public  void setSalary(int salary) {
        this.salary = salary;
    }

    public  int getSalary() {
        return salary;
    }


 abstract public void calculateSalary();
 public void showDetail(){
    System.out.println("name of empoyee  "+name+"id is "+id+"salary  is "+salary);
 }
 
    
}
interface BonusEligible{
    void giveBonus(int bonus);
}
class FulltimeEmployee extends Employee implements BonusEligible{
     int monthlysalary;
 
 
   public FulltimeEmployee(int id,String name, int mo){
    super(id, name);
    this.monthlysalary=mo;
  }
  public void calculateSalary(){
    setSalary(monthlysalary);
//    this.salary=monthlysalary;
   
  }

  public void giveBonus(int bonus){
    // this.salary+=bonus;
    setSalary(getSalary() + bonus);
  }
}

class PartTimeEmployee extends Employee implements BonusEligible{
  private int hour;
  private int rate;
//   private int salary;
  public PartTimeEmployee(int id,String name,int hour,int rate){
    super(id, name);
    this.hour=hour;
    this.rate=rate;

  }
  public  void calculateSalary(){
    // this.salary=hour*rate;
      setSalary(hour*rate);
          
  } 
   public void giveBonus(int bonus){
    // this.salary+=bonus;
    setSalary(getSalary() + bonus);
  }
}
class Intern extends Employee{
  private  int stiped;
    public Intern(int id,String name,int stiped){
        super(id,name);
       this.stiped=stiped;
    }
   public void  calculateSalary(){
    // this.salary=stiped;
    setSalary(stiped);
    
   }
}
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the id of employee=");
        int  id=sc.nextInt();
        // sc.nextLine();  // consume the leftover newline
        System.out.println("enter the employe name=");
        String name=sc.next();
        System.out.println("enter employe salary=");
        int salary=sc.nextInt();

        FulltimeEmployee emp=new FulltimeEmployee(id, name,salary);
        // FulltimeEmployee emp=new FulltimeEmployee(1, "prerna", 200000);
        emp.calculateSalary();

        emp.giveBonus(2000);
        emp.showDetail();
        PartTimeEmployee emp1=new PartTimeEmployee(2," naman", 40, 1000);
        emp1.calculateSalary();
        emp1.giveBonus(2000);
        emp1.showDetail();
        Intern emp2=new Intern(3, "nikunj",30000);
        emp2.calculateSalary();
        emp2.showDetail();
        sc.close();
    }
}




