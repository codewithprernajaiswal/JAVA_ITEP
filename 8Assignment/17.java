// 17. Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews.
import java.util.Scanner;
import java.util.ArrayList;
class Movie{
    private String title;
    private String director;
    private ArrayList<String> reviews;
    // private ArrayList<String> movie;
    public Movie(String title,String director){
        this.title=title;
        this.director=director;
        this.reviews=new ArrayList<String>();
        // this.movie=new ArrayList<String>();
    }
    public Movie(){}
    public void display(){
        System.out.println("movie name:-"+title+"  movie director :-"+director+" reviews of movie:-"
        +reviews);
    }
    public void  addreviews(String review1){
        reviews.add(review1);
    }
    public void removereviews(String review1){
        reviews.remove(review1);

    }


}
class Test{
    public static void main(String args[]){
        Movie m=new Movie("yjhd","karanjohar");
        m.addreviews("nice");
        m.addreviews("good movie..");
          m.display();

        m.removereviews("nice");
        m.display();

    }
}