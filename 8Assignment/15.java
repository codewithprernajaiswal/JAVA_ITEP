// 15. Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.

import java.util.ArrayList;
import java.util.Scanner;
class MusicLibrary{
    ArrayList<Song>arr=new ArrayList<>();
    public void addsong(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the songname:");
        String songname=sc.nextLine();
        // System.out.println("enter the ramdon song to play=");
        // String randomsong=sc.nextLine();
        arr.add(new Song(songname));
        System.out.println("songs added:"+songname);

    }

    public void display(){
        for(Song song:arr){
            System.out.println("--"+song.getTitle());
        }
    }
    // void removeSong(String name){
    //     if(songs.remove(name)){
    //         System.out.println("song remove"+name);
    //     }else{
    //         System.out.println("not found");
    //     }
    // }
}
class Song{
    private String title;
    public Song(String title){
        this.title=title;

    }
    public String getTitle(){
        return title;
    }
}
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        MusicLibrary m=new MusicLibrary();
        m.addsong();
        m.addsong();
        // m.song();
        m.display();
        // System.out.println("enter thte soong you want to remove ");
        // String name=sc.nextLine();
        // m.removeSong(name);
        // m.display();
    }
}