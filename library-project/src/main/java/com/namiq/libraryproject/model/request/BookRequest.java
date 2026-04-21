package com.namiq.libraryproject.model.request;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookRequest {

    @NotBlank(message = "Kitab adı boş ola bilməz")
    @Size(min = 2, max = 100, message = "Kitab adı 2-100 simvol olmalıdır")
    private String title;

    @NotBlank(message = "Müəllif adı boş ola bilməz")
    @Size(min = 2, max = 60, message = "Müəllif adı 2-60 simvol olmalıdır")
    private String author;

    @NotBlank(message = "ISBN boş ola bilməz")
    private String isbn;

    @NotNull(message = "Ümumi nüsxə sayı boş ola bilməz")
    @Min(value = 1, message = "Ən azı 1 kitab olmalıdır")
    private Integer totalCopies;

    @NotNull(message = "Mövcud nüsxə sayı boş ola bilməz")
    @Min(value = 0, message = "Mövcud nüsxə 0-dan kiçik ola bilməz")
    private Integer availableCopies;

    @NotBlank(message = "Kateqoriya boş ola bilməz")
    private String category;


}