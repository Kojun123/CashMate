package com.example.cashmate.mapper;

import com.example.cashmate.domain.AcoountCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountCategoryMapper {

    List<AcoountCategory> findAll(); // 카테고리 전체 조회
    void insert(AcoountCategory acountCategory); // 카테고리 추가


}
