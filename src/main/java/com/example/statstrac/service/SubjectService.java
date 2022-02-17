package com.example.statstrac.service;

import com.example.statstrac.model.Subject;
import com.example.statstrac.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {

    private final SubjectRepository subjectRepository;

    @Autowired
    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<Subject> getSubjects(){
        return subjectRepository.findAll();
    }
    public void addNewSubject(Subject subject){
        subjectRepository.save(subject);
    }


}
