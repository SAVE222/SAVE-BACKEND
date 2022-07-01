package com.example.SAVE.src.accident;

import com.example.SAVE.config.BaseException;
import com.example.SAVE.config.BaseResponseStatus;
import com.example.SAVE.src.accident.model.PostAccidentReq;
import com.example.SAVE.src.accident.model.PostAccidentRes;
import org.springframework.stereotype.Service;

@Service
public class AccidentService {

    private final AccidentProvider accidentProvider;
    private final AccidentDao accidentDao;

    public AccidentService(AccidentProvider accidentProvider, AccidentDao accidentDao) {
        this.accidentProvider = accidentProvider;
        this.accidentDao = accidentDao;
    }

    public PostAccidentRes createRecord(PostAccidentReq postAccidentReq) throws BaseException {
        try{
            int accidentId = accidentDao.createRecord(postAccidentReq);
            return new PostAccidentRes(accidentId);
        }catch(Exception e){
            throw new BaseException(BaseResponseStatus.DATABASE_ERROR);
        }
    }
}
