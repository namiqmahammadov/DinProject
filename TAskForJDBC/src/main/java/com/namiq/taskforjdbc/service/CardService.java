package com.namiq.taskforjdbc.service;

import com.namiq.taskforjdbc.dao.entity.CardEntity;
import com.namiq.taskforjdbc.dao.repository.CardRepository;
import com.namiq.taskforjdbc.mapper.CardMapper;
import com.namiq.taskforjdbc.model.request.CardRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
@RequiredArgsConstructor
public class CardService {
    private final CardRepository cardRepository;
    public void createCard(CardRequest cardRequest){
        CardEntity cardEntity= CardMapper.toEntity(cardRequest);
        cardRepository.save(cardEntity);
    }
    public void blockCard(Integer id) {
        cardRepository.blockCard(id);
    }
    public void updateCardExpiryDate(Integer id , Date expiryDate){
        cardRepository.updateCardExpiryDate(id, expiryDate);
    }
    public void increaseBalance(Integer id , Double amount){
        cardRepository.increaseBalance(id, amount);
    }
    public void unblockCard(Integer id){
        cardRepository.unblockCard(id);
    }
}
