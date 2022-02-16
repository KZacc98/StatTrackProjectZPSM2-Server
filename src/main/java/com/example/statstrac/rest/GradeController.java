package com.example.statstrac.rest;


import com.example.statstrac.dto.GradeEntryDto;
import com.example.statstrac.model.Grade;
import com.example.statstrac.service.GradeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/grade")
public class GradeController {

    private final GradeService gradeService;

    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @PostMapping
    public void addNewGrade(@RequestBody GradeEntryDto gradeDto){
        gradeService.addGrade(gradeDto);
    }

    @GetMapping
    public List<Grade> getGrades(){
        return gradeService.getGrades();
    }

    @GetMapping(path = "{subjectId}")
    public List<Grade> getGradesBySubjectId(@PathVariable Long subjectId){
        return gradeService.getGradesBySubjectId(subjectId);
    }
}
