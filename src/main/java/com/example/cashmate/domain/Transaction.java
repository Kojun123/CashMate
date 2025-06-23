package com.example.cashmate.domain;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class Transaction {
    private Long id;                   // PK
    private Integer accountCategoryId; // FK (AccountCategory.id)
    private BigDecimal amount;         // 금액
    private String note;               // 메모
    private LocalDate transDate;       // 거래 일자
    private LocalDateTime createdAt;   // 등록 시간
    private LocalDateTime updatedAt;   // 수정 시간
}
