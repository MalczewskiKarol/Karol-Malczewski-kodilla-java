package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<BookA> bookASet) {
        Map<BookSignature, BookA> bookMap = new HashMap<>();
        for(BookA bookA : bookASet) {
            bookMap.put(new BookSignature(bookA.getSignature()), new BookA(bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear(), bookA.getSignature()));
        }
        return medianPublicationYear(bookMap);
    }
}