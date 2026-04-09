package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class BookControllerTest {

    BookService bookServiceMock = Mockito.mock(BookService.class);
    BookController bookController = new BookController(bookServiceMock);

    @Test
    void shouldFetchBooks() {
        //given
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);

    }

    @Test
    void shouldAddBook() {
        //given
        BookDto book_3 = new BookDto("Title 3", "Author 3");

        //when
        bookController.addBook(book_3);

        //then
        verify(bookServiceMock, times(1)).addBook(book_3);
    }

    @Test
    void shouldRemoveBook() {
        //given
        List<BookDto> booksList = new ArrayList<>();
        BookDto book_1 = new BookDto("Title 1", "Author 1");
        BookDto book_2 = new BookDto("Title 2", "Author 2");
        booksList.add(book_1);
        booksList.add(book_2);
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        bookController.removeBook(book_1);

        //then
        verify(bookServiceMock, times(1)).removeBook(book_1);
    }

}