package com.example.statstrac.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "Subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long subjectId;
    private String title;
    @OneToMany(mappedBy = "subjectId")
    private List<Grade> gradeList = new ArrayList<>();


    public Subject(String title) {
        this.title = title;
    }


}
