package com.kodilla.rest.service;

import com.kodilla.rest.domain.BookDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private List<BookDto> books = new ArrayList<>();

    public List<BookDto> getBooks() {
        return books;
    }

    public void addBook (BookDto bookDto) {
        books.add(bookDto);
    }

    public String removeBook (BookDto bookDto) {
        if(getBooks().contains(bookDto)) {
            books.remove(bookDto);
            return "Ksiązka usunięta";
        } else {
            return "Nie bylo takiej ksiazki";
        }
    }

}
