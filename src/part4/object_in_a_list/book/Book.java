package part4.object_in_a_list.book;

public class Book {
    private String title;
    private int pages;
    private int publicationYear;

    public Book(String title, int pages, int publicationYear){
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getTitle(){
        return this.title;
    }

    public int getPages(){
        return this.pages;
    }

    public int getPublicationYear(){
        return  this.publicationYear;
    }

    @Override
    public String toString(){
        return this.title + ", " + this.pages + ", " + this.publicationYear;
    }


}
