import java.util.ArrayList;
class Student{
    private String name;
    private String grade;
    // private String course;
    ArrayList<String>course;
    public Student(String name,String grade){
        this.name=name;
        this.grade=grade;
        this.course=new ArrayList<String>();
    }
    public void addcourse(String course1){
        course.add(course1);

    }
    public void removecourse(String course1){
        course.remove(course1);
    }
    public Student(){};
    public void displaydetail(){
        // return name+": "+grade+" :"+course;
       System.out.println("name="+name);
       System.out.println("Grade="+grade);
       System.out.println("course="+course);
    }


}
class Test{
    public static void main(String args[]){
        Student s1=new Student("aayush","A");
        // Student s2=new Student("yash","B","Bsc");
        // Student s3=new Student("khushi","C","bca");
        // School c=new School();
        s1.addcourse("math");
        s1.addcourse("science");
        s1.addcourse("History");
        s1.displaydetail();
        s1.removecourse("math");
        // System.out.println("_________________________");
        s1.displaydetail();
    }
}