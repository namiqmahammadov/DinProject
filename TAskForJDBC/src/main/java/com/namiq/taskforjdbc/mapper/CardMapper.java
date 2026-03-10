package com.namiq.taskforjdbc.mapper;

import com.namiq.taskforjdbc.dao.entity.CardEntity;
import com.namiq.taskforjdbc.model.request.CardRequest;
import com.namiq.taskforjdbc.model.response.CardResponse;

public class CardMapper {

    public static CardEntity toEntity(CardRequest request) {
        if (request == null) {
            return null;
        }

        return CardEntity.builder()
                .holder_name(request.getHolderName())
                .pan(request.getPan())
                .cvv(request.getCvv())
                .expiryDate(request.getExpiryDate())
                .balance(request.getBalance())
                .status(request.getStatus())
                .build();
    }

    public static CardResponse toResponse(CardEntity entity) {
        if (entity == null) {
            return null;
        }

        return CardResponse.builder()
                .id(entity.getId())
                .holderName(entity.getHolder_name())
                .pan(entity.getPan())
                .cvv(entity.getCvv())
                .expiryDate(entity.getExpiryDate())
                .balance(entity.getBalance())
                .status(entity.getStatus())
                .build();
    }
}