package com.namiq.libraryproject.model.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookResponse{

    private Long id;
    private String title;
    private String author;
    private String isbn;
    private Integer availableCopies;
    private String category;
}