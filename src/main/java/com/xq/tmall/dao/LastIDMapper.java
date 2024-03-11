package com.xq.tmall.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface LastIDMapper {
    int selectLastID();
}
