package com.example.realadmin.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // getter, setteer 자동셍성
@AllArgsConstructor // 모든 매개변수를 가진 생성자가 추가됨
public class SearchParam {

    private String account;
    private String email;
    private int page;
}
