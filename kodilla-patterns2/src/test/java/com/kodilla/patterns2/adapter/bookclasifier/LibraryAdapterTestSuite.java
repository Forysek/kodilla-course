package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookLibA;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class LibraryAdapterTestSuite {
    @Test
    public void testPublicationYearMedian() {
        //Given
        BookLibA book1 = new BookLibA("Jacek Dukaj", "Perfekcyjna Niedoskonałość",
                2015,"123456" );
        BookLibA book2 = new BookLibA("Henning Mankell", "Mężczyzna, który się uśmiechał",
                2012, "654321");
        BookLibA book3 = new BookLibA("Chris Carter", "Krucyfiks",
                2015, "123654");
        BookLibA book4 = new BookLibA("Austin Wright", "Zwierzęta Nocy",
                1993, "321456");
        LibraryAdapter libraryAdapter = new LibraryAdapter();
        Set<BookLibA> booksFromLibA = new HashSet<>();
        booksFromLibA.add(book1);
        booksFromLibA.add(book2);
        booksFromLibA.add(book3);
        booksFromLibA.add(book4);

        //When
        int publicationYearMedian = libraryAdapter.publicationYearMedian(booksFromLibA);

        //Then
        assertEquals(2015, publicationYearMedian);
    }
}
