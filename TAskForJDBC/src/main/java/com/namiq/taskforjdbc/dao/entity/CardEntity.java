package com.namiq.taskforjdbc.dao.entity;

import com.namiq.taskforjdbc.enums.StatusCode;
import lombok.*;


import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CardEntity {
  private Integer  id;
    private String holder_name;
   private String  pan;
    private String cvv;
    private Date expiryDate;
    private Double balance;
   private StatusCode status;
}
