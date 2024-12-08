package org.lld_practice.iterator_pattern;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book(19,"Cody"),
                new Book(39,"Bhand"),
                new Book(19,"Saand"),
                new Book(69,"Dalli")
        );

        Library library = new Library(bookList);

        Iterator itr = library.createIterator();

        while(itr.hasNext()) {
            Book b = (Book) itr.next();
            System.out.println(b);
        }
    }
}
