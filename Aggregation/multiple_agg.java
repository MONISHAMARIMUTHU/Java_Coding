import java.util.*;
class Author {
    String name;

    Author(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Author: " + name);
    }
}

class Book {
    String title;
    Author author; // Aggregation: Book "has-a" Author

    Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book: " + title);
        author.display();
    }
}

class Library {
    String name;
    List<Book> books; // Aggregation: Library "has-a" Book

    Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void display() {
        System.out.println("Library: " + name);
        System.out.println("Books:");
        for (Book book : books) {
            book.display();
        }
    }
}

public class multiple_agg {
    public static void main(String[] args) {
        Author a1 = new Author("George Orwell");
        Author a2 = new Author("Harper Lee");

        Book b1 = new Book("1984", a1);
        Book b2 = new Book("To Kill a Mockingbird", a2);

        Library library = new Library("City Library");
        library.addBook(b1);
        library.addBook(b2);

        library.display();
    }
}

