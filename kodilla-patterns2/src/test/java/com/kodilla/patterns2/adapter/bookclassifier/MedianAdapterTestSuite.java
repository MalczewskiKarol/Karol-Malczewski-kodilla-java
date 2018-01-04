package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        bookSet.add(new Book("Author1", "Title1", 1992, "Atr"));
        bookSet.add(new Book("Author2", "Title2", 1997, "Atr2"));
        bookSet.add(new Book("Author3", "Title3", 1972, "Atr3"));
        bookSet.add(new Book("Author4", "Title4", 1987, "Atr4"));
        bookSet.add(new Book("Author5", "Title5", 2001, "Atr5"));

        int result = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(result, 1992, 0);
    }
}
