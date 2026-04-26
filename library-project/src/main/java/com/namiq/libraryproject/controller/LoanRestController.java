package com.namiq.libraryproject.controller;

import com.namiq.libraryproject.model.request.LoanRequest;
import com.namiq.libraryproject.model.response.LoanResponse;
import com.namiq.libraryproject.service.LoanService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/loans")
@RequiredArgsConstructor
public class LoanRestController {
    private final LoanService loanService;

    @PostMapping
    public ResponseEntity<LoanResponse> createLoan(@RequestBody @Valid LoanRequest loanRequest){
        var response=loanService.createLoan(loanRequest);
        return  ResponseEntity
                .status(201)
                .body(response);
    }
    @GetMapping
    public ResponseEntity<List<LoanResponse>> getAllLoans() {
        return ResponseEntity.ok(loanService.getAllLoans());
    }
    @GetMapping(path = "/userId/{userId}")
    public ResponseEntity<List<LoanResponse>>getAllLoansByUserId(@PathVariable Long userId){
        return  ResponseEntity.ok(loanService.getAllLoansByUserId(userId));
    }
    @GetMapping(path = "/bookId/{bookId}")
    public ResponseEntity<List<LoanResponse>>getAllLoansByBookId(@PathVariable Long bookId){
        return  ResponseEntity.ok(loanService.getAllLoansByBookId(bookId));
    }
    @GetMapping(path = "/loanId/{id}")
    public ResponseEntity<LoanResponse>getLoanByLoanId(@PathVariable Long id){
        return  ResponseEntity.ok(loanService.getLoanByLoanId(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<LoanResponse> updateLoan(
            @PathVariable Long id,
            @RequestBody @Valid LoanRequest request) {

        return ResponseEntity.ok(loanService.updateLoan(id, request));
    }
}
