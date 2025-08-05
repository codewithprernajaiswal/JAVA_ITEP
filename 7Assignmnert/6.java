class Movie{
    private String name;
    private String genre;
    private float rating;

    public void setName(String name){
        this.name=name;

    }
    public void setGenre(String genre){
        this.genre=genre;

    }
    public void setRate(float rating){
        this.rating=rating;
    }
    public boolean isHit(){
        if(rating>=8.0){
            return true;
        }
        return false;
    }

    public void display() {
        System.out.println("Movie Name: " + name);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        if (isHit()) {
            System.out.println("movie is a HIT!");
        } else {
            System.out.println("movie is NOT a hit.");
        }
    }
}
class Test{
    public static void main(String args[]){
        Movie m=new Movie();
        m.setName("piku");
        m.setGenre("drama");
        m.setRate(8.9f);
        m.display();
    }
}