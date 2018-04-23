package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Book book1 = new Book("Second Life Syndrome", "Riverside", LocalDate.of(2005, 06, 01));
        Book book2 = new Book("Superunknown", "Soundgarden", LocalDate.of(1994, 10, 10));
        Book book3 = new Book("Facelift", "Alice In Chains", LocalDate.of(1990, 4, 3));
        Book book4 = new Book("Catacombs of the Black Vatican", "Black Label Society", LocalDate.of(2014, 8, 8));
        Book book5 = new Book("Train of Thought", "Dream Theater", LocalDate.of(2003, 8, 19));

        Library library = new Library("Original Library");
        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);
        library.books.add(book4);
        library.books.add(book5);

        //shallow copy of the library
        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Shallowed-copied Library");
        } catch(CloneNotSupportedException e){
            System.out.println(e);
        }

        //deep copy of the library
        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep-copied Library");
        } catch(CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.books.remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(4, clonedLibrary.books.size());
        Assert.assertEquals(library.books.size(), clonedLibrary.books.size());
        Assert.assertEquals(5, deepClonedLibrary.books.size());
    }
}
