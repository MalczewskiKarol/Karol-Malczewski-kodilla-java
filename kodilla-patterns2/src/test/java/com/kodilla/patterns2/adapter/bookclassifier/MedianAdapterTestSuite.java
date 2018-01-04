package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<BookA> bookASet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        bookASet.add(new BookA("Author1", "Title1", 1992, "Atr"));
        bookASet.add(new BookA("Author2", "Title2", 1997, "Atr2"));
        bookASet.add(new BookA("Author3", "Title3", 1972, "Atr3"));
        bookASet.add(new BookA("Author4", "Title4", 1987, "Atr4"));
        bookASet.add(new BookA("Author5", "Title5", 2001, "Atr5"));

        int result = medianAdapter.publicationYearMedian(bookASet);

        //Then
        assertEquals(result, 1992, 0);
    }
}
