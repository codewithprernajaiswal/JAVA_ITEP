import java.util.Scanner;

 class Assignment2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length in cm : ");
        int l= sc.nextInt();
        System.out.print("Enter the width in cm: ");
        int w = sc.nextInt();
        System.out.print("Enter the height in cm: ");
        int h = sc.nextInt();
         System.out.print("Enter the cuboid edge in cm: ");
        int c= sc.nextInt();
        // vc volime of cube 
        int vc=c*c*c;
        int  vcuboid=l*w*h;
        System.out.println("volume ofcube is ="+vc+"volulme of cuboid="+vcuboid);
        if(vc>=vcuboid){
            System.out.println("the cube has more volume");

        }else{
            System.out.println("coboid has more value ");
        }
         
    }
 }
    
          
       
    
    

    
    