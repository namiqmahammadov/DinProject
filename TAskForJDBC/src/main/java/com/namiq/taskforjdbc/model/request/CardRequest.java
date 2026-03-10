package com.namiq.taskforjdbc.model.request;

import com.namiq.taskforjdbc.enums.StatusCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardRequest {
    private String holderName;
    private String pan;
    private String cvv;
    private Date expiryDate;
    private Double balance;
    private StatusCode status;
}
