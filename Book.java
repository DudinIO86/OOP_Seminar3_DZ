import java.util.Comparator;

public class Book implements Comparable <Book> {
    private String title;
    private String author;
    private int publishedYear;

    public Book(String title,String author,int publishedYear){
        this.title=title;
        this.author=author;
        this.publishedYear=publishedYear;
    }
    public String GetTitle(){
        return title;
    }

    public String GetAuthor(){
        return author;
    }

    public int GetPublishedYear(){
        return publishedYear;
    }

    Comparator<Book> authorSort=new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.GetAuthor().compareTo(o2.GetAuthor());
        }
    };

    Comparator<Book> yearSort=new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return Integer.compare(o1.GetPublishedYear(),o2.GetPublishedYear());
        }
    };
    @Override
    public int compareTo(Book otherBook){
        return this.title.compareTo(otherBook.GetTitle());
    }

    @Override
    public String toString(){
        return "Название книги: "+title+"\n"+"Автор: "+author+"\n"+"Год издания: "+publishedYear+"\n";
    }
}
