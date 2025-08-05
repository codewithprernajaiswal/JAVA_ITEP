class Student{
    private String name;
    private int mathmarks;
    private int sciencemarks;

    public void setMath(int mathmarks){
        this.mathmarks=mathmarks;
    }
    public void setScience(int sciencemarks){
        this.sciencemarks=sciencemarks;
    }
    public double getAverage(){
          return(mathmarks+sciencemarks)/2.0;
    }
    public void display(){
         
        System.out.println("Average Marks: " + getAverage());
    }
    }

    class Test{
        public static void main(String args[]){
            Student s=new Student();
            s.setMath(85);
            s.setScience(90);
            s.display();
        }
    }
