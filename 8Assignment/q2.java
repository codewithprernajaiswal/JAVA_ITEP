class Dog{
    private String name;
    private String breed;
    public Dog(String name,String breed){
        this.name=name;
        this.breed=breed;
    }
      public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
    public String getBreed(){
        return breed;
    }        
    public   void Display(){
        System.out.println("Name="+name);
        System.out.println("breed="+breed);
    }
}
class Test{
    public static void main(String args[]){
        Dog d1=new Dog("chikku","chihuahua");
        Dog d2=new Dog("piku","bulldog");
        d1.Display();
        d2.Display();

    }

}