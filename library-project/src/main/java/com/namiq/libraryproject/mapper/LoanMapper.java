package com.namiq.libraryproject.mapper;

import com.namiq.libraryproject.dao.entity.Book;
import com.namiq.libraryproject.dao.entity.Loan;
import com.namiq.libraryproject.dao.entity.User;
import com.namiq.libraryproject.model.request.LoanRequest;
import com.namiq.libraryproject.model.response.LoanResponse;
import org.springframework.stereotype.Component;

@Component
public class LoanMapper {

    public static Loan toEntity(LoanRequest request, User user, Book book) {
        if (request == null) {
            return null;
        }

        return Loan.builder()
                .user(user)
                .book(book)
                .borrowDate(request.getBorrowDate())
                .dueDate(request.getDueDate())
                .build();
    }

    public static LoanResponse toResponse(Loan loan) {
        if (loan == null) {
            return null;
        }

        return LoanResponse.builder()
                .id(loan.getId())
                .userName((loan.getUser().getFullName()))
                .bookTitle(loan.getBook().getTitle())
                .borrowDate(loan.getBorrowDate())
                .dueDate(loan.getDueDate())
                .returnDate(loan.getReturnDate())
                .isReturned(loan.getIsReturned())
                .build();
    }
}