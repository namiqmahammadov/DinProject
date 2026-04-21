package com.namiq.libraryproject.model.request;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class LoanRequest {

    @NotNull(message = "İstifadəçi boş ola bilməz")
    private Long userId;

    @NotNull(message = "Kitab boş ola bilməz")
    private Long bookId;

    @NotNull(message = "Götürülmə tarixi boş ola bilməz")
    @PastOrPresent(message = "Götürülmə tarixi gələcəkdə ola bilməz")
    private LocalDate borrowDate;

    @NotNull(message = "Qaytarılma son tarixi boş ola bilməz")
    @Future(message = "Son tarix gələcəkdə olmalıdır")
    private LocalDate dueDate;

}
