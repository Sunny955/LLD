package org.lld_practice.iterator_pattern;

import java.util.List;

public class BookIterator implements Iterator{
    private final List<Book> bookList;
    private int index = 0;
    public BookIterator(List<Book> bookList) {
        this.bookList = bookList;

    }
    @Override
    public boolean hasNext() {
        return index < bookList.size();
    }
    @Override
    public Object next() {
        if(this.hasNext()) {
            return bookList.get(index++);
        }
        return null;
    }
}
