class Assignment3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the breadth: ");
        int breadth= sc.nextInt();
        System.out.print("Enter the length ");
        int length= sc.nextInt();

        int area = length*breadth;
        System.out.print("The area of rectangle : " + area);
    }
}