package com.example.SAVE.src.accident;

import com.example.SAVE.src.accident.model.PostAccidentReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccidentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int createRecord(PostAccidentReq postAccidentReq) {
        String createRecordQuery = "insert into test_accident (userName, childName, date_str, sound, location) VALUES (?, ?, ?, ?, ?)";
        Object[] createRecordParams = new Object[]{postAccidentReq.getUserName(), postAccidentReq.getChildName(), postAccidentReq.getDate(), postAccidentReq.getSound(), postAccidentReq.getLocation()};

        this.jdbcTemplate.update(createRecordQuery, createRecordParams);

        String lastInsertIdQuery = "select last_insert_id()";
        return this.jdbcTemplate.queryForObject(lastInsertIdQuery, int.class);
    }
}