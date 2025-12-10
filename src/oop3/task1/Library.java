package oop3.task1;

import java.util.ArrayList;


public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book + "kitabxanaya elave edildi");
    }

    public void showAvailableBooks() {
        boolean found = false;
        for (Book b : books) {
            if (b.isAvailable()) {
                System.out.println(b);
                found = true;
            }
            if (!found) {
                System.out.println("book not avilable");

            }

        }

    }
}
