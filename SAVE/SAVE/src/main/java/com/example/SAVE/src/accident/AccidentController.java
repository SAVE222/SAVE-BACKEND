package com.example.SAVE.src.accident;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accident")
public class AccidentController {

    private final AccidentService accidentService;

    public AccidentController(AccidentService accidentService) {
        this.accidentService = accidentService;
    }

    //연결 잘 되는지 테스트 용 함수
//    @ResponseBody
//    @GetMapping("")
//    public int test(){
//        return 100;
//    }
}
