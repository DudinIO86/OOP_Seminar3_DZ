import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Library {
    List<Book> books=new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void getBooks(){
        Collections.sort(books);
        Iterator<Book> iterator=books.iterator();


        while(iterator.hasNext()){
            Book books=iterator.next();
            System.out.println(books);
        }

    }

    public void getBooksSortAuthor() {
        Collections.sort(books, books.getFirst().authorSort);
        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {
            Book books = iterator.next();
            System.out.println(books);
        }
    }

    public void getBooksSortYear() {
        Collections.sort(books, books.getFirst().yearSort);
        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {
            Book books = iterator.next();
            System.out.println(books);
        }
    }
}
