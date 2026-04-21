package com.namiq.libraryproject.service;

import com.namiq.libraryproject.model.request.BookRequest;
import com.namiq.libraryproject.model.response.BookResponse;
import jakarta.validation.Valid;

import java.util.List;


public interface BookService {
    BookResponse createBook( BookRequest bookRequest);

    List<BookResponse> getAllBooks();

    BookResponse getBookById(Long id);

    BookResponse updateBook(Long id, BookRequest bookRequest);


    void deleteBookById(Long id);
}
