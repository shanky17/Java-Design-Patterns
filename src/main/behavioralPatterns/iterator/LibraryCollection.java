package main.behavioralPatterns.iterator;

import java.util.List;

public class LibraryCollection implements IterableCollector {
    private List<Book> books;

    public LibraryCollection(List<Book> books) {
        this.books = books;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(books);
    }
}
