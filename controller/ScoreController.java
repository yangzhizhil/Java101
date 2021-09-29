package com.jsoftech.module.student.score.controller;

import com.jsoftech.core.api.Response;
import com.jsoftech.module.student.score.dto.request.ScorePageReqDTO;
import com.jsoftech.module.student.score.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 成绩 控制类
 */
@RestController
@RequestMapping("/students/score")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    /**
     * 获取成绩列表
     * @param examName
     * @param curPage
     * @param pageSize
     * @return
     */
    @GetMapping("/list")
    public Response list(String examName, Integer curPage, Integer pageSize){
        ScorePageReqDTO scorePageReqDTO = new ScorePageReqDTO();
        scorePageReqDTO.setExamName(examName);
        scorePageReqDTO.setCurPage(curPage);
    }

}