package book;

import java.util.ArrayList;
import java.util.List;

class Book{
    private int id;
    private String title;
    private String author;

    private List<Book> bookList= new ArrayList<>();
    public Book(int id,String title,String author){
        this.id=id;
        this.title=title;
        this.author=author;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void addBook(Book book)
    {
        bookList.add(book);
        System.out.println(book.getTitle()+"added to the book list");
    }

    public void deleteBook(Book book){
        if(bookList.contains(book)){
            bookList.remove(book);
            System.out.println(book.getTitle()+"removed from book");
        }
        else{
            System.out.println("cannot delete. book is not present");
        }
    }

    public Book findById(int id){
        for(Book book:bookList){
            if(book.getId()==id){
                return book;
            }
        }
        System.out.println("Book id"+id +"not found");
        return null;
    }
    @Override
    public String toString(){
        return "BookId "+id+ "Title " +title+ "Author " +author;
    }


}


public class BookSystem {
    public static void main(String[] args) {

        Book book1 = new Book(1,"HarryPotter ","JKR");
        Book book2 = new Book(2,"Science of universe ","Brain cox");

        Book bookManager = new Book(0,"","");
        bookManager.addBook(book1);
        bookManager.addBook(book2);


        Book foundBook = bookManager.findById(1);
        System.out.println(foundBook);

        bookManager.deleteBook(book2);







    }
}
