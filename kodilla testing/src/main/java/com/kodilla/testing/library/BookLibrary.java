package com.kodilla.testing.library;

        import java.util.ArrayList;
        import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {

        List<Book> bookList = new ArrayList<Book>();
        if(titleFragment.length() < 3) return bookList;

        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if(resultList.size() > 20) return bookList;

        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {

        List<Book> emptyBookInHandList = new ArrayList<Book>();
        if(libraryDatabase.listBooksInHandsOf(libraryUser).size() == 0)
            return emptyBookInHandList;

        List<Book> resultList = libraryDatabase.listBooksInHandsOf(libraryUser);
        if(resultList.size() > 5) return emptyBookInHandList;

        emptyBookInHandList = resultList;
        return resultList;
    }
}