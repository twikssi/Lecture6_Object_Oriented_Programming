package by.andrey.twikss.exe2book.bean;

import java.util.Objects;

public class Book {
    private String author;
    private String nameBook;
    private int countOfPage;

    public Book(String author, String nameBook, int countOfPage) {
        this.author = author;
        this.nameBook = nameBook;
        this.countOfPage = countOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getCountOfPage() {
        return countOfPage;
    }

    public void setCountOfPage(int countOfPage) {
        this.countOfPage = countOfPage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return countOfPage == book.countOfPage &&
                Objects.equals(author, book.author) &&
                Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, nameBook, countOfPage);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", nameBook='" + nameBook + '\'' +
                ", countOfPage=" + countOfPage +
                '}';
    }
}
