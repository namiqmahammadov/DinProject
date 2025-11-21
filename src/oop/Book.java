package oop;

public class Book {
    private String title;
    private String author;
    private Integer price;

    public Book(String title, String author, Integer price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book( String title, String author) {
        this.title = title;
        this.author = author;

    }

    public Book() {
    }
}
