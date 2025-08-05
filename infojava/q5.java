class Question5{
    public  static void main(String args[]){  
     
        int cost=1600,rate=25,l=20;
        float area=cost/rate;
        float b=area/l;
        float perimeter=2*(l+b);

        System.out.println("The area is "+area+" square cm");
        System.out.println("The breadth of rectangle is "+b+" cm");
        System.out.println("The perimeter of a rectangle is "+perimeter+" cm");
    }
    
}