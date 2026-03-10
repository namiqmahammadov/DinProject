package com.namiq.taskforjdbc.controller;

import com.namiq.taskforjdbc.model.request.BalanceRequest;
import com.namiq.taskforjdbc.model.request.CardRequest;
import com.namiq.taskforjdbc.model.request.UpdateExpiryDateRequest;
import com.namiq.taskforjdbc.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@RestController
@RequestMapping(path = "/cards")
@RequiredArgsConstructor
public class CardRestController {
    private final CardService cardService;


    @PostMapping
    public void createCard(@RequestBody CardRequest cardRequest) {
          cardService.createCard(cardRequest);

    }

    @PutMapping("/{id}/block")
    public void blockCard(@PathVariable Integer id) {
        cardService.blockCard(id);
    }

    @PutMapping("/{id}/unblock")
    public void unblockCard(@PathVariable Integer id) {
        cardService.unblockCard(id);
    }

    @PutMapping("/{id}/expiry-date")
    public void updateCardExpiryDate(@PathVariable Integer id,
                                     @RequestBody UpdateExpiryDateRequest request) {
        cardService.updateCardExpiryDate(id, request.getExpiryDate());
    }


    @PutMapping("/{id}/increase-balance")
    public void increaseBalance(@PathVariable Integer id,
                                  @RequestBody BalanceRequest request) {
        cardService.increaseBalance(id, request.getAmount());

    }
}

