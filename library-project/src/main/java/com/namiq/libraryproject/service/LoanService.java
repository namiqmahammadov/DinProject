package com.namiq.libraryproject.service;

import com.namiq.libraryproject.dao.repository.LoanRepository;
import com.namiq.libraryproject.model.request.LoanRequest;
import com.namiq.libraryproject.model.response.LoanResponse;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LoanService {
    LoanResponse createLoan(@Valid LoanRequest loanRequest);

    List<LoanResponse> getAllLoans();

    List<LoanResponse> getAllLoansByUserId(Long userId);

    List<LoanResponse> getAllLoansByBookId(Long bookId);

    LoanResponse getLoanByLoanId(Long id);

    LoanResponse updateLoan(Long id, LoanRequest request);
}
