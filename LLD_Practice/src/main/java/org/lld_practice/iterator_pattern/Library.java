package org.lld_practice.iterator_pattern;

import java.util.List;

// Concrete Aggregate
public class Library implements Aggregate {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(books);
    }
}
