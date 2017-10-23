package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library #1");

        library.getBooks().add(new Book("Title1", "Author1", LocalDate.of(2006, 3, 24)));
        library.getBooks().add(new Book("Title2", "Author2", LocalDate.of(2001, 6, 11)));
        library.getBooks().add(new Book("Title3", "Author3", LocalDate.of(1995, 1, 29)));
        library.getBooks().add(new Book("Title4", "Author4", LocalDate.of(2003,8, 3)));
        library.getBooks().add(new Book("Title5", "Author5", LocalDate.of(1997, 11, 9)));

        //shallowCopy
        Library clonedBooks = null;
        try {
            clonedBooks = library.shallowCopy();
            clonedBooks.setName("Library #2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deepCopy
        Library deepClonedBooks = null;
        try {
            deepClonedBooks = library.deepCopy();
            deepClonedBooks.setName("Library #3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().clear();
        //Then
        Assert.assertEquals(0, library.getBooks().size());
        Assert.assertEquals(0, clonedBooks.getBooks().size());
        Assert.assertEquals(5, deepClonedBooks.getBooks().size());
        System.out.println(library.name + "\n" + library.getBooks());
        System.out.println("==========");
        System.out.println(clonedBooks.name + "\n" + clonedBooks.getBooks());
        System.out.println("==========");
        System.out.println(deepClonedBooks.name + "\n" + deepClonedBooks.getBooks());

    }
}
