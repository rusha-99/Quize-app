package com.demo.quizeapp.controller;

import com.demo.quizeapp.entity.Question;
import com.demo.quizeapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionsbyCategory(@PathVariable String category){
        return questionService.getQuestionsbyCategory(category);
    }

    @PostMapping("addQuestion")
    public Question addQuestion(@RequestBody Question question){
        return questionService.saveQuestion(question);

    }
}
