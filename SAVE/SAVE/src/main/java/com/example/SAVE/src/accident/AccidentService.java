package com.example.SAVE.src.accident;

import org.springframework.stereotype.Service;

@Service
public class AccidentService {

    private final AccidentDao accidentDao;

    public AccidentService(AccidentDao accidentDao) {
        this.accidentDao = accidentDao;
    }
}
