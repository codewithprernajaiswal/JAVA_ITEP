/*Network Connection
Suppose you are connecting to a server. The connection might fail due to network issues.
Which exception will be thrown?
Should you handle it with try-catch or let it propagate using throws? Why?*/
import java.util.Scanner;

class NetworkFailException extends Exception{
    public NetworkFailException(){
        super("Network is not found due some technical issue"
        );
    }
}
class Test{
    static String finalpassword = "12345";
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter your username");
        String name = sc.nextLine();
        System.out.println("Enter your Password");
        String password = sc.nextLine();

        if(password.equals(finalpassword)){
            System.out.println("access granted");
        }
        else{
            throw new NetworkFailException();
        }
    }
    catch(NetworkFailException e){
        System.out.println(e.getMessage());
    }

    }
}


