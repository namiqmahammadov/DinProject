package com.namiq.libraryproject.dao.repository;

import com.namiq.libraryproject.dao.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;

public interface LoanRepository extends JpaRepository<Loan,Long> {
    List<Loan> findAllByUserId(Long userId);

    List<Loan> findAllByBookId(Long bookId);
}
