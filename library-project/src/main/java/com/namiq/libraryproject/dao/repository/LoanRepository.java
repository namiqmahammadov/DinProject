package com.namiq.libraryproject.dao.repository;

import com.namiq.libraryproject.dao.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan,Long> {
}
