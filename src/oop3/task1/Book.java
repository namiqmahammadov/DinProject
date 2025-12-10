package oop3.task1;

public class Book {
    private String title;
    private String author;
    private Integer year;
    private boolean isAvailable = true;

    public Book(String title, String author, Integer year) {
        this.title = title;
        this.author = author;
        this.year = year;

    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void borrow() {
        if (isAvailable) {
            setAvailable(false);
            System.out.println(title + "kitab goturuldu");
        } else {
            System.out.println("kitab movcud deyil");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            setAvailable(true);
            System.out.println("kitab qaytarildi");
        } else {
            System.out.println("kitab goturulmemisdir");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
