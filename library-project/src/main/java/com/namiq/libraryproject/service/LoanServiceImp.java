package com.namiq.libraryproject.service;

import com.namiq.libraryproject.dao.entity.Book;
import com.namiq.libraryproject.dao.entity.Loan;
import com.namiq.libraryproject.dao.entity.User;
import com.namiq.libraryproject.dao.repository.BookRepository;
import com.namiq.libraryproject.dao.repository.LoanRepository;
import com.namiq.libraryproject.dao.repository.UserRepository;
import com.namiq.libraryproject.exception.BookNotAvailableException;
import com.namiq.libraryproject.exception.BookNotFoundException;
import com.namiq.libraryproject.exception.LoanNotFoundException;
import com.namiq.libraryproject.exception.UserNotFoundException;
import com.namiq.libraryproject.mapper.LoanMapper;
import com.namiq.libraryproject.model.request.LoanRequest;
import com.namiq.libraryproject.model.response.LoanResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoanServiceImp implements LoanService{
    private final LoanRepository loanRepository;
    private final UserRepository userRepository;
    private final BookRepository bookRepository;


    @Override
    public LoanResponse createLoan(LoanRequest loanRequest) {
        var user = userRepository.findById(loanRequest.getUserId())
                .orElseThrow(() -> new RuntimeException("İstifadəçi tapılmadı"));
        var book = bookRepository.findById(loanRequest.getBookId())
                .orElseThrow(() -> new RuntimeException("Kitab tapılmadı"));
        if (book.getAvailableCopies() <= 0) {
            throw new BookNotAvailableException("Kitab mövcud deyil");
        }
        var loan= LoanMapper.toEntity(loanRequest,user,book);

        book.setAvailableCopies(book.getAvailableCopies() - 1);

        var loanSaved=loanRepository.save(loan);
        bookRepository.save(book);
        return LoanMapper.toResponse(loanSaved);


    }

    @Override
    public List<LoanResponse> getAllLoans() {
            List<Loan> loans=loanRepository.findAll();
            return
       loans.stream()
               .map(LoanMapper::toResponse)
               .toList();
    }

    @Override
    public List<LoanResponse> getAllLoansByUserId(Long userId) {
        if (!userRepository.existsById(userId)) {
            throw new UserNotFoundException("İstifadəçi tapılmadı");
        }

        return loanRepository.findAllByUserId(userId)
                .stream()
                .map(LoanMapper::toResponse)
                .toList();
    }


    @Override
    public List<LoanResponse> getAllLoansByBookId(Long bookId) {
        if (!bookRepository.existsById(bookId)) {
            throw new BookNotFoundException("İstifadəçi tapılmadı");
        }

        return loanRepository.findAllByBookId(bookId)
                .stream()
                .map(LoanMapper::toResponse)
                .toList();
    }

    @Override
    public LoanResponse getLoanByLoanId(Long id) {
        var loan=loanRepository.findById(id)
                .orElseThrow(()->new LoanNotFoundException("Borc melumati tapilmadi"));
        return  LoanMapper.toResponse(loan);
    }

    @Override
    public LoanResponse updateLoan(Long id, LoanRequest request) {

        Loan loan = loanRepository.findById(id)
                .orElseThrow(() -> new LoanNotFoundException("Borcalma tapılmadı"));

        User user = userRepository.findById(request.getUserId())
                .orElseThrow(() -> new UserNotFoundException("İstifadəçi tapılmadı"));

        Book newBook = bookRepository.findById(request.getBookId())
                .orElseThrow(() -> new BookNotFoundException("Kitab tapılmadı"));

        Book oldBook = loan.getBook();

        if (!oldBook.getId().equals(newBook.getId())) {
            if (newBook.getAvailableCopies() <= 0) {
                throw new BookNotAvailableException("Kitab mövcud deyil");
            }

            oldBook.setAvailableCopies(oldBook.getAvailableCopies() + 1);
            newBook.setAvailableCopies(newBook.getAvailableCopies() - 1);
        }

        LoanMapper.updateEntity(request, loan, user, newBook);

        Loan updatedLoan = loanRepository.save(loan);

        return LoanMapper.toResponse(updatedLoan);
    }
}
