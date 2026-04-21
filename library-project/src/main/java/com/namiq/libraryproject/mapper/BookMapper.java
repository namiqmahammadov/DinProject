package com.namiq.libraryproject.mapper;

import com.namiq.libraryproject.dao.entity.Book;
import com.namiq.libraryproject.dao.entity.User;
import com.namiq.libraryproject.model.request.BookRequest;
import com.namiq.libraryproject.model.request.UserRequest;
import com.namiq.libraryproject.model.response.BookResponse;

public class BookMapper {

    public static Book toEntity(BookRequest request) {
        if (request == null) {
            return null;
        }

        return Book.builder()
                .title(request.getTitle())
                .author(request.getAuthor())
                .isbn(request.getIsbn())
                .totalCopies(request.getTotalCopies())
                .availableCopies(request.getAvailableCopies())
                .category(request.getCategory())
                .isActive(true) // default olaraq true
                .build();
    }

    public static BookResponse toResponse(Book book) {
        if (book == null) {
            return null;
        }

        return BookResponse.builder()
                .id(book.getId())
                .title(book.getTitle())
                .author(book.getAuthor())
                .isbn(book.getIsbn())
                .availableCopies(book.getAvailableCopies())
                .category(book.getCategory())
                .build();
    }
    public static void updateEntity(BookRequest request, Book book) {
        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());
        book.setIsbn(request.getIsbn());
        book.setAvailableCopies(request.getAvailableCopies());
        book.setCategory(request.getCategory());
    }
}