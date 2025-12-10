package oop3.task1;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("j1 ", "j1", 1234);
        Book book2 = new Book("j2", "j2", 321);
        library.addBook(book1);
        library.addBook(book2);
        book1.borrow();
        library.showAvailableBooks();
        book1.returnBook();
        library.showAvailableBooks();
    }
}
