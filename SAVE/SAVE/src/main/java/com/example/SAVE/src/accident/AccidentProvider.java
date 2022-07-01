package com.example.SAVE.src.accident;

import com.example.SAVE.config.BaseException;
import com.example.SAVE.config.BaseResponseStatus;
import org.springframework.stereotype.Service;

@Service
public class AccidentProvider {

    private final AccidentDao accidentDao;

    public AccidentProvider(AccidentDao accidentDao) {
        this.accidentDao = accidentDao;
    }
}
