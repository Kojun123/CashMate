package com.example.cashmate.mapper;


import com.example.cashmate.domain.Transaction;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TransactionMapper {

    List<Transaction> findAll(); // 모든 거래내역 조회
    void insert(Transaction transaction); // 거래내역추가
}
