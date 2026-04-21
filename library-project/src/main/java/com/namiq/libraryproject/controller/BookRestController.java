package com.namiq.libraryproject.controller;

import com.namiq.libraryproject.model.request.BookRequest;
import com.namiq.libraryproject.model.response.BookResponse;
import com.namiq.libraryproject.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/books")
@RequiredArgsConstructor
public class BookRestController {
    private final BookService bookService;

    @PostMapping
    public ResponseEntity<BookResponse> createBook(@RequestBody @Valid BookRequest bookRequest) {
        var response = bookService.createBook(bookRequest);
        return ResponseEntity
                .status(201)
                .body(response);
    }

    @GetMapping
    public ResponseEntity<List<BookResponse>> getAllBooks() {
        var response = bookService.getAllBooks();
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/bookId/{id}")
    public ResponseEntity<BookResponse> getBookById(Long id) {
        var respone = bookService.getBookById(id);
        return ResponseEntity.ok(respone);
    }

    @PutMapping(path = "/bookId/{id}")
    public ResponseEntity<BookResponse> updateBook(Long id,
                                                   @RequestBody @Valid BookRequest bookRequest){
        var response=bookService.updateBook(id,bookRequest);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping(path = "/bookId/{id}")
    public ResponseEntity<Void> deleteBookById(@PathVariable Long id){
        bookService.deleteBookById(id);
        return ResponseEntity.noContent().build();
    }

}
