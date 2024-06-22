package main.behavioralPatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book(100, "Harry Potter"));
        books.add(new Book(250, "The Jungle Book"));
        books.add(new Book(130, "Macbeth"));
        books.add(new Book(80, "The Great Gatsby"));
        books.add(new Book(180, "Hamlet"));

        LibraryCollection libraryCollection = new LibraryCollection(books);
        Iterator booksIterator = libraryCollection.createIterator();

        while (booksIterator.hasNext()) {
            Book book = (Book) booksIterator.next();
            System.out.println("Book: " + book.getName() + ", Price: " + book.getPrice());
        }

        booksIterator.reset();
    }
}
