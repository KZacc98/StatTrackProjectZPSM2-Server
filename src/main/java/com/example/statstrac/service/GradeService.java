package com.example.statstrac.service;

import com.example.statstrac.model.Grade;
import com.example.statstrac.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {
    private final GradeRepository gradeRepository;

    @Autowired
    public GradeService(GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }

    public List<Grade> getGrades(){
        return gradeRepository.findAll();
    }

    public void addGrade(Grade grade){
        gradeRepository.save(grade);
    }


}
