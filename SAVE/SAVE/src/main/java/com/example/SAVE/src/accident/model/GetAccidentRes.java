package com.example.SAVE.src.accident.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GetAccidentRes {

    private String userName;
    private String childName;
    private String date;
    private int sound;
    private String location;
}
