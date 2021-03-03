package com.shayyoz.offersystem.model.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CalcRequest {
    private Long purposeCode;
    private Double amount;
    private Integer months;
    private LocalDate firstPayment;
}
