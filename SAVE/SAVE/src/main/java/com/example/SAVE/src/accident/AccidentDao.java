package com.example.SAVE.src.accident;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccidentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
}