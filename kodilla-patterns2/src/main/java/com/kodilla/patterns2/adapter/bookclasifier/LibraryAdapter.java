package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookLibA;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookLibB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LibraryAdapter extends LibraryAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<BookLibA> bookSet) {
        Map<BookSignature, BookLibB> booksMap = new HashMap<>();
        for(BookLibA book : bookSet) {
            booksMap.put(new BookSignature(book.getSignature()),
                    new BookLibB(
                            book.getAuthor(),
                            book.getTitle(),
                            book.getPublicationYear()
                    ));
        }
        return medianPublicationYear(booksMap);
    }
}
