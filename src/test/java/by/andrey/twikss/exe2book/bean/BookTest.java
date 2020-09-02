package by.andrey.twikss.exe2book.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testEqualsReturnTrue() {
        Book book1 = new Book("Remark", "Live", 400);
        Book book2 = new Book("Remark", "Live", 400);

        boolean expected = true;
        boolean actual = book1.equals(book2);

        assertEquals(expected,actual);

    }

    @Test
    public void testEqualsReturnFalse() {
        Book book1 = new Book("Capote", "Breakfast at Tiffanies", 300);
        Book book2 = new Book("Remark", "Live", 400);

        boolean expected = false;
        boolean actual = book1.equals(book2);

        assertEquals(expected,actual);

    }

    @Test
    public void testHashCode() {
        Book book = new Book("Remark", "Live", 400);

        long expected = -387761661;
        long actual = book.hashCode();

        assertEquals(expected,actual);
    }

    @Test
    public void testToString() {
        Book book = new Book("Remark", "Live", 400);

        String expected = "Book{author='Remark', nameBook='Live', countOfPage=400}";
        String actual = book.toString();

        assertEquals(expected,actual);
    }

    @Test
    public void getAuthorReturnString() {
            Book book = new Book("Remark", "Live", 400);
            book.setAuthor("Bamby");

            String expected = "Bamby";
            String actual = book.getAuthor();

            assertEquals(expected,actual);
    }

    @Test
    public void getNameBookReturnInputName() {
        Book book = new Book("Remark", "Live", 400);
        book.setNameBook("The West Front No Changes");

        String expected = "The West Front No Changes";
        String actual = book.getNameBook();

        assertEquals(expected,actual);
    }

    @Test
    public void getCountOfPage() {
        Book book = new Book("Remark", "Live", 400);
        book.setCountOfPage(465);

        int expected = 465;
        int actual = book.getCountOfPage();

        assertEquals(expected,actual);
    }
}