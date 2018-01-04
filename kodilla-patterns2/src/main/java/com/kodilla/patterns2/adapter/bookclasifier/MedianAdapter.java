package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<BookA> bookASet) {
        Map<BookSignature, BookA> bookMap = new HashMap<>();
        for(BookA b : bookASet) {
            bookMap.put(new BookSignature(b.getSignature()), new BookA(b.getAuthor(), b.getTitle(), b.getPublicationYear(), b.getSignature()));
        }
        return medianPublicationYear(bookMap);
    }
}