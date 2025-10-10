// 9. Online Library System

// A student is trying to issue more books than the limit (say, 3).

// Should you handle it with a business rule check or by throwing a custom exception MaxBooksIssuedException?

// Justify your answer.\
class MaxBooksIssuedException extends Exception{
   public  MaxBooksIssuedException(){
    super("you can't issue book more than 3...");
   }
}
class Library{
      int count=0;
    public void bookissue() throws MaxBooksIssuedException{  
    
    if(count>=3){
        throw new MaxBooksIssuedException();
    }
        count++;
        System.out.println(" booked issued="+count);
    
    }
}
class Test{
    public static void main(String args[]){
        Library l=new Library();
        try{
        l.bookissue();
        l.bookissue();
        l.bookissue();
        l.bookissue();
        l.bookissue();
        l.bookissue();
    }catch( MaxBooksIssuedException e){
        System.out.println(e.getMessage());
    }
    
}
}