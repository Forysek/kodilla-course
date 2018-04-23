package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype{
    String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    @Override
    public String toString() {
        String s = name + ":\n";
        for (Book book : books) {
            s = s + "Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", date of publication: "
                    + book.getPublicationDate() +"\n";
        }
        return s;
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();
        clonedLibrary.books = new HashSet<>();
        for(Book library : books){
            clonedLibrary.books.add(library);
        }
        return clonedLibrary;
    }
}