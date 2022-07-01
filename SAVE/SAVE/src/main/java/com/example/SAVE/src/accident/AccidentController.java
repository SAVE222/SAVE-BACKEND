package com.example.SAVE.src.accident;

import com.example.SAVE.config.BaseException;
import com.example.SAVE.config.BaseResponse;
import com.example.SAVE.config.BaseResponseStatus;
import com.example.SAVE.src.accident.model.PostAccidentReq;
import com.example.SAVE.src.accident.model.PostAccidentRes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accident")
public class AccidentController {

    private final AccidentService accidentService;

    public AccidentController(AccidentService accidentService) {
        this.accidentService = accidentService;
    }


    @ResponseBody
    @PostMapping("")
    public BaseResponse<PostAccidentRes> createRecord(@RequestBody PostAccidentReq postAccidentReq){

        try{
            if(postAccidentReq.getUserName().length() < 1){
                return new BaseResponse<>(BaseResponseStatus.RECORD_INVALID_CONTENTS);
            }
            if(postAccidentReq.getChildName().length() < 1){
                return new BaseResponse<>(BaseResponseStatus.RECORD_INVALID_CONTENTS);
            }
            if(postAccidentReq.getDate().length() != 10){
                return new BaseResponse<>(BaseResponseStatus.RECORD_INVALID_VALUES);
            }
            if(postAccidentReq.getSound() < 0){
                return new BaseResponse<>(BaseResponseStatus.RECORD_INVALID_VALUES);
            }
            if(postAccidentReq.getLocation().length() < 1){
                return new BaseResponse<>(BaseResponseStatus.RECORD_INVALID_CONTENTS);
            }

            PostAccidentRes postAccidentRes = accidentService.createRecord(postAccidentReq);
            return new BaseResponse<>(postAccidentRes);
        }catch(BaseException e){
            return new BaseResponse<>(e.getStatus());
        }
    }
}
