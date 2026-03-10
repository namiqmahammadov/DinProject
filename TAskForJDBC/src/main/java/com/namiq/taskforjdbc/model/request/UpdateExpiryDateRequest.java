package com.namiq.taskforjdbc.model.request;

import lombok.Data;

import java.sql.Date;

@Data
public class UpdateExpiryDateRequest {
    private Date expiryDate;
}