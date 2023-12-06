package com.demo.quizeapp.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String questiontitle;
    private String option1;
    private String option2;
    private String rightanswer;
    private String difficultylevel;
    private String category;

}
