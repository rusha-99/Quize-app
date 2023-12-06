package com.demo.quizeapp.service;

import com.demo.quizeapp.entity.Question;
import com.demo.quizeapp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    public List<Question> getAllQuestions(){
        return questionRepository.findAll();
    }

    public List<Question> getQuestionsbyCategory(String category) {
        return questionRepository.findByCategory(category);
    }

    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }
}
