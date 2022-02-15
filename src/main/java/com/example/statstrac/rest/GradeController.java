package com.example.statstrac.rest;


import com.example.statstrac.dto.GradeEntryDto;
import com.example.statstrac.model.Contact;
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
    public void addNewGrade(@RequestBody GradeEntryDto gradeEntryDto){
        gradeService.addGrade(gradeEntryDto);
    }

    @GetMapping
    public List<Grade> getGrades(){
        return gradeService.getGrades();
    }
}
