package part5.objects_and_references.song;

public class Song {
    private String artist;
    private String title;
    private int durationInSecond;

    public Song(String artist, String title, int durationInSecond){
        this.artist = artist;
        this.title = title;
        this.durationInSecond = durationInSecond;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.durationInSecond + " s)";
    }

    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Song)){
            return false;
        }

        Song comparedSong = (Song) compared;
        if(this.title.equals(comparedSong.title) && this.artist.equals(comparedSong.artist) && this.durationInSecond == comparedSong.durationInSecond){
            return true;
        }
        return false;
    }
}
