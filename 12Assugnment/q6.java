// 6. Student Management System

// You are fetching student data from a database. If the record is not found:

// Will you return null or throw a RecordNotFoundException?

// Which approach is better and why? 
    
import java.util.Scanner;

class RecordNotFoundException extends Exception{
        RecordNotFoundException(String msg){
            super(msg);
        }
}
class Test{
    public static void main(String args[]){
        String names[] = {"shyam","ram","gopal","pawan"};

        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the student name");
        String s = sc.nextLine();

        boolean found = false;
        for (String name : names) {
        if (name.equals(s)) {  
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Data is found in database "+s);
        }
        else {
           try{
            throw new RecordNotFoundException("Record not found");
           }
           catch(RecordNotFoundException e){
            System.out.println(e.getMessage());
           }
           
        }
    }
}

