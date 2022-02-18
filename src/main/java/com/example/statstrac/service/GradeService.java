package com.example.statstrac.service;

import com.example.statstrac.dto.GradeEntryDto;
import com.example.statstrac.model.Grade;
import com.example.statstrac.model.Subject;
import com.example.statstrac.repository.GradeRepository;
import com.example.statstrac.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {
    private final GradeRepository gradeRepository;
    private final SubjectRepository subjectRepository;

    @Autowired
    public GradeService(GradeRepository gradeRepository, SubjectRepository subjectRepository) {
        this.gradeRepository = gradeRepository;
        this.subjectRepository = subjectRepository;
    }

    public List<Grade> getGrades(){
        return gradeRepository.findAll();
    }

    public List<Grade> getGradesBySubjectId(Long subjectId){
        return gradeRepository.findGradeBySubjectId(subjectId);
    }

    public void addGrade(GradeEntryDto grade){
        Grade gradeToSave=new Grade();
        Subject subject= subjectRepository.findById(grade.getSubjectId()).orElse(null);
        gradeToSave.setGradeValue(grade.getGradeValue());
        gradeToSave.setNote(grade.getNote());
        gradeToSave.setSubjectId(subject.getSubjectId());
        gradeRepository.save(gradeToSave);
    }


}
