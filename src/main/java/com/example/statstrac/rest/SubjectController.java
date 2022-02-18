package com.example.statstrac.rest;

import com.example.statstrac.model.Subject;
import com.example.statstrac.service.SubjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/subject")
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping
    public List<Subject> getSubjects(){
        return subjectService.getSubjects();
    }

    @PostMapping(path = "/add")
    public void addSubject(@RequestBody Subject subject){
        subjectService.addNewSubject(subject);
    }
}
